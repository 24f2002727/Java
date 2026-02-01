package NPTEL_JAVA.week1;

/*
Week 01 : Programming Assignment 3
Due on 2026-02-05, 23:59 IST
1 - Problem Statement:      

Write a Java program to calculate the volume of a cylinder given its radius and height.

Formula:

V = π x r^2 x h

You can use Math.PI for the computation.
*/
import java.util.Scanner;

public class W01_P3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();
        // Calculate the volume
        double volume=Math.PI*radius*radius*height;
        System.out.println(volume);

    }
}
