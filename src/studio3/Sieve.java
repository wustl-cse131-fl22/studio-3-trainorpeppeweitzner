package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		//Get user input for size of an array
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers would you like to sift?");
		int size = in.nextInt();
		
		//Create array of booleans
		boolean[] numbers = new boolean[size];
		for(int i = 0; i < size; i++) {
			numbers[i] = true;
		}
		
		//Sift through numbers and define composite numbers as false
		for(int c = 2; c < size; c++) {
			if (numbers[c-1] == true) {
				for(int j = (2*c); j <= size; j+=c) {
					numbers[j-1] = false;
				}
			}
		}
		
		//Printing all the prime numbers
		for(int i = 0; i < size; i++) {
			if (numbers[i] == true) {
				System.out.print((i + 1) + " ");
			}
		}
	}

}
