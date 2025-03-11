package com.basics;

import java.util.*;

public class Conditions {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter NUmber");

    int button = sc.nextInt();

        // int x =  sc.nextInt();
        // int y = sc.nextInt();

        // if(age > 18) System.out.println("You can Vote"); 
        // else System.out.println("You cannot Vote");


        // if(x%2 == 0) {
        //     System.out.println("Number is EVEN");
        // } else{
        //     System.out.println("Number id ODD");
        // }

        // if(x == y) {
        //     System.out.println("Number are equal");
        // } else {
        //     if (x>y) {
        //         System.out.println("X is greater than y");
        //     } else {
        //         System.out.println("X is less than y");
        //     }
        // }
        
        // if (x==y) {
        //     System.out.println("Number are equal");
        // } else if (x > y) {
        //     System.out.println("X is greater");
        // } else {
        //     System.out.println("y is greater");
        // }

        switch (button) {
            case 5:
                System.out.println("No is 1");
                break;
            case 2:
                System.out.println("No is 2");
                break;
            default:
                break;
        }
    
    }
}