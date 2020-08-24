package practice;

import java.util.Scanner;

//12) Write a program to display if the entered year is a leap year or not. 
public class YearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			System.out.println("year is leap year");
		}
		else 
		{
			System.out.println("enter year is not leap year");
		}
	}

}
