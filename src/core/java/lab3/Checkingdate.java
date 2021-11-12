package core.java.lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Checkingdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		int year=sc.nextInt();
		System.out.print("Enter month : ");
		int month=sc.nextInt();
		System.out.print("Enter date : ");
		int date=sc.nextInt();
		LocalDate givendate =LocalDate.of(year, month, date);
		LocalDate nowdate =LocalDate.now();
		
		Period diff =Period.between(givendate, nowdate);
		System.out.println("differences between two dates are :");
		System.out.println(diff.getYears()+ "years " + diff.getMonths()+" months "+ diff.getDays()+"day");
        sc.close();


	}

}
