package com.jbowers.app.cen4802;
public class Fibonacci {

  /**
   * Returns the nth term in the Fibonacci sequence
   * 
   * @param n   The nth term in the Fibonacci sequence
   * @return    The value of the term at the nth position of the Fibonacci sequence
   */
  public static int fibonacci(int n) {
    if (n <= 1)
      return n;
    else
      return fibonacci(n-1) + fibonacci(n-2);
    }	 
}