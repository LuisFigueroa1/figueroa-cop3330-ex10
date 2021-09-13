package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 10 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App
{
    public static void main( String[] args ) //main function
    {
        Scanner userInput = new Scanner(System.in);

        //declare the variables that will be used in the items and prices
        String price1;
        String quant1;
        String price2;
        String quant2;
        String price3;
        String quant3;

        //scan all the numbers
        System.out.println( "Enter the price of item 1: " );
        price1 = userInput.nextLine(); //scan the input
        System.out.println( "Enter the quantity of item 1: " );
        quant1 = userInput.nextLine(); //scan the input
        System.out.println( "Enter the price of item 2: " );
        price2 = userInput.nextLine(); //scan the input
        System.out.println( "Enter the quantity of item 2: " );
        quant2 = userInput.nextLine(); //scan the input
        System.out.println( "Enter the price of item 3: " );
        price3 = userInput.nextLine(); //scan the input
        System.out.println( "Enter the quantity of item 3: " );
        quant3 = userInput.nextLine(); //scan the input

        int price1i = Integer.parseInt(price1);
        int quant1i = Integer.parseInt(quant1);
        int price2i = Integer.parseInt(price2);
        int quant2i = Integer.parseInt(quant2);
        int price3i = Integer.parseInt(price3);
        int quant3i = Integer.parseInt(quant3);

        //math operations
        double subtot = (price1i * quant1i) + (price2i * quant2i) + (price3i * quant3i);
        double tax = (subtot * 0.055);
        double total = subtot + tax;

        //print output
        System.out.println("Subtotal: $" + subtot + "\nTax: $" + tax +
                "\nTotal: $" + total);
    }
}
