package HW2_4113056002;

class Student {
    private String name;
    private Laboratory lab;
    
    Student(String name){
    	this.name = name;
    	System.out.println("Student "+this.name+" registered at NCHU. ");
    }
    
    String getName() {
    	return this.name;
    }
    
    Laboratory getLab() {
    	return this.lab;
    }
    
    void setLab(Laboratory Lab) {
    	this.lab = Lab;
    	System.out.println(this.name+" joined "+this.lab.getLabName()+".");
    }
    
    void getTeacherName() {
    	System.out.println(this.name+"'s advisor is "+this.lab.getTeacher().getTeacherName());
    }
}

class Professor {
    private String teacherName;
    private String major;
    
    Professor(String teacherName, String major){
    	this.teacherName = teacherName;
    	this.major = major;
    	System.out.println("Professor "+this.teacherName+"’s expertise includes "+this.major+".");
    }
    
    String getTeacherName() {
    	return this.teacherName;
    }
}

class Laboratory{
    private String labName;
    private int numOfStudent;
    private Professor teacher;
    
    Laboratory(String labName, int numOfStudent, Professor teacher){
    	this.labName = labName;
    	this.numOfStudent = numOfStudent;
    	this.teacher = teacher;
    	System.out.println("Create "+this.labName+" with "+this.numOfStudent+" vacancies.");
    }
    
    String getLabName() {
    	return this.labName;
    }
    
    void checkRemainPlaces() {
    	if (this.numOfStudent > 0) {
    		System.out.println(this.labName+" still has "+this.numOfStudent+" vacancies.");
    	}
    	else {
    		System.out.println(this.labName+" has no vacancies.");
    	}
    }
    
    Professor getTeacher() {
    	return this.teacher;
    }
    
    void addStudent(Student student) {
        if (student.getLab() != null) {
            if (student.getLab() == this) {
                System.out.println(student.getName()+" has already joined "+this.labName+".");
                return;
            } else {
                System.out.println(student.getName()+" has already joined "+student.getLab().getLabName()+".");
                return;
            }
        }
        else if (this.numOfStudent <= 0) {
            System.out.println(student.getName()+" noticed that "+this.labName+" had reached full capacity.");
            return;
        }
        else {
            student.setLab(this);
            this.numOfStudent -= 1;
        }
    }
}

public class HW2_4113056002 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jason Lin","Information Security");// Professor Jason Lin's expertise includes Information Security.
        Professor professor2 = new Professor("Frank Fan","Natural Language Processing");// Professor Frank Fan's expertise includes Natural Language Processing.
        Student student1 = new Student("Andy");// Student Andy registered at NCHU.
        Student student2 = new Student("Bob");// Student Bob registered at NCHU.
        Student student3 = new Student("Vicky");// Student Vicky registered at NCHU.

        Laboratory lab1 = new Laboratory("ISLab",2, professor1);// Create ISLab with 2 vacancies.
        Laboratory lab2 = new Laboratory("NLPLab",3, professor2);// Create NLPLab with 3 vacancies.

        lab1.addStudent(student1);// Andy joined ISLab.
        lab1.addStudent(student2);// Bob joined ISLab.
        lab2.addStudent(student2);// Bob has already joined ISLab.
        lab1.addStudent(student3);// Vicky noticed that ISLab had reached full capacity.
        lab2.addStudent(student3);// Vicky joined NLPLab.

        lab1.checkRemainPlaces();// ISLab has no vacancies.
        lab2.checkRemainPlaces();// NLPLab still has 2 vacancies.

        student2.getTeacherName();// Bob's advisor is Jason Lin.
        student3.getTeacherName();// Vicky's advisor is Frank Fan.

    }
}