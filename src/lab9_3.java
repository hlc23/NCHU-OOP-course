import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class StudentDataIO {
    public void writeData(Student[] students, String filename) {
    	FileWriter fw;
    	
    	try{
    		fw = new FileWriter(filename);
    		for (Student s: students) {
    			fw.write(s.getId() + " " + s.getName() + " " + s.getScore()+"\n");
    		}
    		fw.close();
    	}
    	catch (IOException e) {
    		return;
    	}
    }

	public Student[] readData(String filename) {
    	File f = new File(filename);
    	Scanner sc;
    	Student[] sl = new Student[0];
    	try {
			sc = new Scanner(new FileInputStream(f));

			int lc = 0;
			while (sc.hasNextLine() && sc.hasNext()) {
				sc.nextLine();
				lc++;
			}
			sl = new Student[lc];
			lc = 0;
			sc.close();

			sc = new Scanner(new FileInputStream(f));
			while (sc.hasNextLine() && sc.hasNext()) {
				sl[lc] = new Student(
						sc.next(),
						sc.next(), 
						sc.nextInt());
				lc++;
			}
		}
    	catch (IOException e) {
    		
    	}
    	return sl;
    }
}

class Student {
    private String id;
    private String name;
    private int score;

    public Student(String id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    
    public boolean isEqual(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            return this.getId().equals(s.getId())
                && this.getName().equals(s.getName())
                && this.getScore() == s.getScore();
        }
        return false;
    }

}

public class lab9_3{
    public static void main(String[] args) {
        // 1. Create a list of students.
        Student[] students = new Student[3];
        students[0] = new Student("001", "Alice", 95);
        students[1] = new Student("002", "Bob", 88);
        students[2] = new Student("003", "Charlie", 90);

        // 2. Use the StudentData class to write the list of students to a file.
        StudentDataIO sio = new StudentDataIO();
        sio.writeData(students, "data.txt");

        // 3. Read the list of students from the file.
            //TODO (Put the read Data into the array named "readStudents")
        Student[] readStudents = sio.readData("data.txt");

        // 4. Check if the written and read student lists are the same.
        if (students.length != readStudents.length) {
            System.out.println("Fail: The number of students is not the same.");
            return;
        }
        for (int i = 0; i < students.length; i++) {
            //TODO (If there is unequal data, output "Fail: The student data is not the same.")
        	if (! (students[i].isEqual(readStudents[i]))) {
        		System.out.println("Fail: The student data is not the same.");
        	}
        }
   

        System.out.println("Test pass!");
    }
}
