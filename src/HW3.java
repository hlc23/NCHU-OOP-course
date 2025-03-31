package HW_4113056002;

import java.util.Scanner;

class BullsAndCows {
	int codeSize;
	int code;
	int[] code_array;
	int guess;
	int[] guess_array;
	Scanner scanner;
	
	public BullsAndCows(){
		this.scanner = new Scanner(System.in);
		this.codeSize = -1;
		if (!(this.codeSize == 3 || this.codeSize == 4 || this.codeSize == 5 || this.codeSize == 0)) {
			this.codeSize = this.askNumberOfDigits();
		}
		if (this.codeSize == 0) cheat();
		else {
			this.code_array = new int[this.codeSize];
			this.generate();
			while (checkDuplicate(this.code_array)) {
				this.generate();
			}
		}
		this.numberToGuess();
		this.guess_array = new int[this.codeSize];
		while (true) {
			this.guess = this.getGuess();
			if (intSize(this.guess) > this.codeSize) {
				System.out.println("You can only enter "+this.codeSize+" digits.");
				continue;
			}
			this.int2array(this.guess, this.guess_array);
			if (this.checkDuplicate(this.guess_array)) {
				System.out.println("Each number must be different.");
				continue;
			}
			
			int bulls = 0, cows = 0;
			for (int i=0; i<this.codeSize; i++) {
				if (this.guess_array[i] == this.code_array[i]) {
					bulls++;
					continue;
				}
				for (int c: this.code_array) {
					if (this.guess_array[i] == c) {
						cows++;
						continue;
					}
				}
			}
			System.out.print(bulls+" bulls");
			
			if (bulls == this.codeSize) {
				System.out.print("... ");
				for (int i=0; i<this.codeSize; i++) {
					System.out.print(this.code_array[i]);
					if (i != this.codeSize-1) System.out.print("-");
				}
				System.out.println(" is correct!");
				break;
			}

			System.out.println();
			System.out.print(cows+" cows");
			System.out.println();
		}
	}
	
	private void numberToGuess() {
		System.out.print("Number to guess: ");
		for (int i=0; i<this.codeSize; i++) {
			System.out.print(this.code_array[i]);
			if (i != this.codeSize-1) System.out.print("-");
		}
		System.out.println();
	}
	
	private int intSize(int n) {
		int c = 0;
		while (n > 0) {
			c += 1;
			n /= 10;
		}
		return c;
	}
	
	private int getGuess() {
		System.out.print("Enter Guess: ");
		return this.scanner.nextInt();
	}
	
	private boolean checkDuplicate(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if (i == j) continue;
				if (arr[i] == arr[j]) return true;
			}
		}
		return false;
	}
	
	private void generate() {
		this.code = (int)( Math.random() * Math.pow(10, this.codeSize));
		this.int2array(this.code, this.code_array);
	}
	
	private int askNumberOfDigits(){
		System.out.print("Enter number of digits in code (3, 4 or 5): ");
		return this.scanner.nextInt();
	}
	
	private void cheat() {
		System.out.print("Enter code: ");
		this.code = this.scanner.nextInt();
		System.out.print("Enter number of digits in code: ");
		this.codeSize = this.scanner.nextInt();
		this.code_array = new int[this.codeSize];
		this.int2array(this.code, this.code_array);
	}
	
	private void int2array(int n, int[] arr) {
		int array_size = arr.length;
		
		for (int i=array_size-1; i>=0; i--) {
			arr[i] = n % 10;
			n /= 10;
		}
	}
}

public class HW3_4113056002 {
	public static void main(String[] args) {
		BullsAndCows game = new BullsAndCows();
	}
}
