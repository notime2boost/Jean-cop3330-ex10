package ex10;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of item 1:");
        double item1P = input.nextDouble();
        System.out.println("Enter the quantity of item 1:");
        double item1Q = input.nextDouble();
        System.out.println("Enter the price of item 2:");
        double item2P = input.nextDouble();
        System.out.println("Enter the quantity of item 2:");
        double item2Q = input.nextDouble();
        System.out.println("Enter the price of item 3:");
        double item3P = input.nextDouble();
        System.out.println("Enter the quantity of item 3:");
        double item3Q = input.nextDouble();

        double subtotal =(item1P * item1Q)+(item2P * item2Q)+(item3Q * item3P);
        double tax = subtotal * 0.055;

        double total = tax + subtotal;

        System.out.println("Subtotal: $"+subtotal);
        System.out.println("Tax: $"+tax);
        System.out.println("Total: $"+total);
    }
}
