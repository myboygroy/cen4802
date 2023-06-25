package com.jbowers.app.cen4802;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	boolean exit = false;
    	while(exit == false) {
    		System.out.println("Enter a number to run through the Fibonacci machine");
            int fibInput = scanner.nextInt();
            int fibAnswer = Fibonacci.fibonacci(fibInput);
            System.out.println("The value at the position of " + fibInput + " in the Fibonacci sequence is " + fibAnswer);
            System.out.println("Would you like to play again?");
            System.out.println("Type '1' to play again and any other character to exit");
            int canExit = scanner.nextInt();
            if  (canExit == 1) {
            	exit = false;
            	System.out.println("Let's do this again");
            }
            else {
            	exit = true;
            	System.out.println("Goodbye, Joachim");
            }	
    	}
    	
    }
}