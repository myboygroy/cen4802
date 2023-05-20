class Fibonacci {

  public static int fibonacci(int n) {
    if (n <= 1)
      return n;
   else
     return fibonacci(n-1) + fibonacci(n-2);
    }	 	 
  public static void main(String[] args){
    int input = 10;
    System.out.println("The value at the position of " + input + " in the Fibonacci sequence is " + fibonacci(input));
  }

}