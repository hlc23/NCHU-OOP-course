import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class lab9_2{
	public static void main(String[] args){
		File fileName = new File("input2.txt");
		Scanner sc;
		try {
			sc = new Scanner(new FileInputStream(fileName));
		}
		catch (IOException e) {
			System.out.println("Error while reading "+fileName);
			return;
		}
		
		int l=0;
		double n, s=0;
		while (sc.hasNextDouble()) {
			n = sc.nextDouble();
			s += n;
			l++;
		}
		System.out.println(s/l);
		
		sc.close();
	}
}