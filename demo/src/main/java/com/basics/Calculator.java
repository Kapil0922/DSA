package com.basics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No 1");
        int a = sc.nextInt();
        System.out.println("Enter No 2");
        int b = sc.nextInt();

        System.out.println("Operation to perform : 1.Addition 2.Subtraction 3.Multiplication 4.Divison 5.Modulo");
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Addition is :" + (a + b));
                break;
            case 2 :
                System.out.println("Subtraction is :" +(a-b) );
                break;
            case 3 :
                System.out.println("Multiplication is :" + (a*b));
                break;
            case 4 :
                System.out.println("Division is :" + (a/b));
                break;
            case 5:
                System.out.println("Modulo is :" + (a%b) );
                break;
            default:
                break;
        }
    }
}
