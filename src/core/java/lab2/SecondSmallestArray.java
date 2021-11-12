package core.java.lab2;

import java.util.Scanner;

public class SecondSmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondSmallestArray sobj = new SecondSmallestArray();
		Scanner sc = new Scanner(System.in);
		System.out.print(" Value of n = ");
        int number = sc.nextInt();		
		sobj.getSecondSmallest(number);
		sc.close();
		
	}
	
	public void getSecondSmallest(int n) {
    Scanner sc = new Scanner(System.in);
    
	int temp;
	System.out.print(" Values : ");
	int[] aa = new int[n];
	
	
	for(int i = 0; i<n; i++ )
	{
		aa[i] = sc.nextInt();    // here assigned values by using scanner 
	}

    for(int i = 0; i<n; i++ )
    {
       for(int j = i+1; j<n; j++)
       {
          if(aa[i]>aa[j])
          {
             temp = aa[i];
             aa[i] = aa[j];
             aa[j] = temp;
          }
       }
    }
    System.out.println("2nd Smallest element is:: "+aa[1]);
    sc.close();

	}

}
