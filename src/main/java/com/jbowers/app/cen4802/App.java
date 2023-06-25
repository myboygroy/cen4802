package com.jbowers.app.cen4802;

public class App 
{
    public static void main( String[] args )
    {
        int fibInput = 9;
        int fibAnswer = Fibonacci.fibonacci(fibInput);
        System.out.println("The value at the position of " + fibInput + " in the Fibonacci sequence is " + fibAnswer);
        }
}