// 39. Write a program to check if a given number is a neon number.

import java.util.Scanner;

public class NeonNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isNeon = isNeonNumber(num);
        if (isNeon) {
            System.out.println(num + " is a neon number.");
        } else {
            System.out.println(num + " is not a neon number.");
        }
        scanner.close();
    }

    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == num;
    }
}
