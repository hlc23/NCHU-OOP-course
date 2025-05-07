import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class lab9_1{
	public static void main(String[] args){
		File fileName = new File("input1.txt");
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new FileInputStream(fileName));
		}
		catch (IOException e) {
			System.out.println("Error while reading "+fileName);
			return;
		}
		
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			if (n == 10) count++;
		}
		System.out.println("The number of occurrences of number 10 is " + count);
		sc.close();
	}
}