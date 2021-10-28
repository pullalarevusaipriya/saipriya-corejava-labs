package lab1.q5;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter n number : ");
        int n = sc.nextInt();                      // n number
        int x = 3, y = 5;
     
        System.out.println(sum(n, x, y));
        sc.close();
    }
	static int sum(int N, int X, int Y)
    {
        int S1, S2, S3;
     
        S1 = ((N / X)) * (2 * X + (N / X - 1) * X) / 2;
        S2 = ((N / Y)) * (2 * Y + (N / Y - 1) * Y) / 2;
        S3 = ((N / (X * Y))) * (2 * (X * Y) + (N / (X * Y) - 1) * (X * Y))/ 2;
     
        return S1 + S2 - S3;
    }
}


