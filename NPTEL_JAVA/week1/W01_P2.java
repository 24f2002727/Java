package NPTEL_JAVA.week1;

/*
Week 01 : Programming Assignment 2
Due on 2026-02-05, 23:59 IST
Write a Java program to print the area and perimeter of a rectangle.

*/
import java.util.Scanner;
public class W01_P2 { 
   public static void main(String[] strings) {
       double width ;
       double height;

       Scanner in = new Scanner(System.in);
       width = in.nextDouble();
       height = in.nextDouble();
       // Calculate the perimeter of the rectangle
        double perimeter=2*(width+height);
        System.out.println(perimeter);


        // Calculate the area of the rectangle
        double area=width*height;
        System.out.println(area);
   }
}   
       