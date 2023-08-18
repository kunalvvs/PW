package Practice.DSA.NumberSystem_BitManu;

import java.util.Scanner;

public class BinarytoDec {
    public static int binaryToDecimal(String binary) {
            int decimal = 0;
            int power = 0;
            
            for (int i = binary.length() - 1; i >= 0; i--) {
                int digit = Character.getNumericValue(binary.charAt(i));
                decimal += digit * Math.pow(2, power);
                power++;
            }
            
            return decimal;
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter binary num : ");
            String binary = sc.nextLine(); // Replace with your binary string
            
            int decimal = binaryToDecimal(binary);
            
            System.out.println("Binary: " + binary);
            System.out.println("Decimal: " + decimal);
        }
        
        
    }
    

  