package lab2.q7;

import java.util.Scanner;

public class Checknumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num;
	       boolean flag = false;

	       Scanner scanner = new Scanner(System.in);

	       System.out.println("Enter a number : ");
	       num = scanner.nextInt();

	       int curDgt = num % 10;
	       num = num/10;
	       scanner.close();

	       while(num>0)
	       {
	           if(curDgt <= num % 10)
	           {
	               flag = true;
	               break;
	           }
	           curDgt = num % 10;
	           num = num/10;
	       }
	       if(flag)
	       {
	           System.out.println("Digits are not in increasing order.");
	       }
	       else
	       {
	           System.out.println("Digits are in increasing order.");
	       }
	}
}
