package com.basics;

import java.util.Scanner;

public class Loops {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        // for(int i = 0;i<3 ; i++){
        //     System.out.println("For loop " + i);
        // }

        //int i =0;
        // while ( i<11) {
        //     System.out.println(i); 
        //     i++;
        // }

        // do {
        //     System.out.println(i);
        //     i++;
        // } while (i < 11);
        
        //Sum of first n natural numbers
                // System.out.println("enter first n numbers to add");
                // int a = sc.nextInt();

                // int sum = 0;
                // for(int i= 1 ; i <= a ; i++){
                // sum = sum + i;
                // }
                // System.out.println("Sum : " + sum);

        //Print a table

                // System.out.println("Enter the number to have table");
                // int a = sc.nextInt();

                // int i =1;
                // while (i <= 10) {
                //     System.out.println(a+"*"+i+ ": " + a*i);
                //     i++;
                // }

        // Check if no is prime or not
            System.out.println("Enter no to check :");
            int a = sc.nextInt();
            int count = 0;
            if (a == 1) {
                count= 1;                
            } else {
                for (int i= 1; i<= a; i++){
                    if (a%i == 0) {
                        count++ ;
                    }
                }
            }

            if (count == 2) {
                System.out.println("Given number is prime");
            } else if (count == 1){
                System.out.println("Given number is not prime Nor Composite");
            } else System.out.println("Given number is not prime");
            
    }
}
