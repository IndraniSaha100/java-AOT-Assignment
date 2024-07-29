/*
 * *  22. Write a Java Program to convert a binary number to octal number.

 */
import java.util.Scanner;

public class Q22 {

    // Method to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1; // 2^0

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }

        return decimal;
    }

    // Method to convert decimal to octal
    public static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();

        while (decimal != 0) {
            int remainder = decimal % 8;
            octal.insert(0, remainder);
            decimal /= 8;
        }

        return octal.toString();
    }

    // Method to convert binary to octal
    public static String binaryToOctal(String binary) {
        int decimal = binaryToDecimal(binary);
        return decimalToOctal(decimal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        String octal = binaryToOctal(binary);
        System.out.println("The octal equivalent is: " + octal);
        scanner.close();
    }
}

