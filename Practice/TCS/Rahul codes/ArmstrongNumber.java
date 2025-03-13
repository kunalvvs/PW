import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int rem, new_num, armstrong = 0;
        new_num = num;
        
        // Count the number of digits dynamically
        int digits = String.valueOf(num).length();

        while (num > 0) {
            rem = num % 10;
            armstrong += Math.pow(rem, digits); // Raising to the power of total digits
            num /= 10;
        }

        // Compare the computed sum with the original number
        if (new_num == armstrong) {
            System.out.println(new_num + " is an Armstrong number.");
        } else {
            System.out.println(new_num + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
