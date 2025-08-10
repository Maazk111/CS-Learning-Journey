//package com.company;

import java.util.Scanner;
//import java.util.*; --> call all build in packages
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input as " + a);
    }
}
