package core.java.lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SumofIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter squence of digits with space in between them");
		                          String digit=sc.nextLine();
		                          StringTokenizer token=new StringTokenizer(digit);
		                          int dig=0,sum=0;
		                          System.out.println("Entered digits are  ");
		                          while(token.hasMoreTokens())
		                          {
		                                      String s=token.nextToken();
		                                      dig=Integer.parseInt(s);
		                                      System.out.print(dig+" ");
		                                      sum=sum+dig;
		                          }
		                          System.out.println();
		                          System.out.println("Sum is : "+sum);

	}

}
