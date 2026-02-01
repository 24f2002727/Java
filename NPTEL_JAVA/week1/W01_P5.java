package NPTEL_JAVA.week1;

/*
Week 01 : Programming Assignment 5
Due on 2026-02-05, 23:59 IST
Complete the code fragment that reads two integer inputs from keyboard and compute the quotient and remainder.

*/

import java.util.Scanner;
public class W01_P5{
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int x=sc.nextInt();
	   int y=sc.nextInt();
	   //code for quotient and remainder
		int quotient=x/y;
		int remainder=x%y;
		System.out.println(quotient);
		System.out.println(remainder);
	   }
}
