package core.java.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Alphabeticalorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabeticalorder .sortStrings();
	}

	public static void sortStrings() {
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		// Declare array size
		int n;
		System.out.print("Enter number of elements : ");
		// Initialize array size
		n = scan.nextInt();

		String arr[] = new String[n];
		System.out.println("Enter the String : ");
		for (int i = 0; i < n; i++) {
			arr[i] = scan1.nextLine();
		}

		Arrays.sort(arr); // Sort the array in alphabetical order

		System.out.println(Arrays.toString(arr)); // Display the array
		scan.close();
		scan1.close();

	}

}
