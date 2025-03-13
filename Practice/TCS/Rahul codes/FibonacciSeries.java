public class FibonacciSeries {
  public static int fib(int n) {
      if (n <= 1) return n; // Base case

      int first = 0, second = 1, next = 0;
      for (int i = 2; i <= n; i++) {
          next = first + second;
          first = second;
          second = next;
      }
      return second; // Return the nth Fibonacci number
  }

  public static void main(String[] args) {
      int n = 10; // Example input
      System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
  }
}


