// 42. Write a program to check if a given number is a Harshad number.

import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isHarshad = isHarshadNumber(num);
        if (isHarshad) {
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is not a Harshad number.");
        }
        scanner.close();
    }

    public static boolean isHarshadNumber(int num) {
        int sumOfDigits = 0;
        int originalNum = num;
        while (num > 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }
        return originalNum % sumOfDigits == 0;
    }
}
