import java.util.Scanner;

public class PalindromeNumber {

    public static boolean palindrome(int num) {
        if (num < 0) {
            return false; // Negative numbers are not palindromes
        }

        int reversed = 0;
        int original = num;

        while (num > 0) {
            int last_digit = num % 10;
            reversed = reversed * 10 + last_digit;
            num = num / 10;
        }

        return original == reversed;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: "); 

        int num = sc.nextInt();
        sc.close();

        if (palindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
