package lab2.q3;

import java.util.Scanner;

public class Fibonicc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of n:");
		int n = sc.nextInt();
		
		System.out.print("Fibonacci Series of "+n+" numbers: ");    // if we implements in multiple methods we can called as recursive
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(fibonacciRecur(i) +" ");
		}
		sc.close();
	}
	public static int fibonacciRecur(int n)
	{
		if(n == 0)
		 {
			return 0;
		 }
		if(n == 1 || n == 2)
		 {
			return 1;
		 }
		return fibonacciRecur(n-2) + fibonacciRecur(n-1);

	}

}
