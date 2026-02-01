package NPTEL_JAVA.week1;

/*
Week 01 : Programming Assignment 4
Due on 2026-02-05, 23:59 IST
Write a Java program to print the multiplication table of a given number up to 4.
*/

import java.util.Scanner;

public class W01_P4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        // Print the multiplication table of number up to 5
        for(int i=1;i<5;i++)
        {
        System.out.printf("%d x %d = %d\n",number,i,number*i);
        }
    }
}