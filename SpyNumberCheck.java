// 40. Write a program to check if a given number is a spy number.

import java.util.Scanner;

public class SpyNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isSpy = isSpyNumber(num);
        if (isSpy) {
            System.out.println(num + " is a spy number.");
        } else {
            System.out.println(num + " is not a spy number.");
        }
        scanner.close();
    }

    public static boolean isSpyNumber(int num) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        while (num > 0) {
            int digit = num % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            num /= 10;
        }
        return sumOfDigits == productOfDigits;
    }
}
