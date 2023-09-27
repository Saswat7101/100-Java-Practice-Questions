// 26. Write a program to check if a given number is a palindromic number.

import java.util.Scanner;

public class PalindromicNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        if (reversedNum == originalNum) {
            System.out.println(originalNum + " is a palindromic number.");
        } else {
            System.out.println(originalNum + " is not a palindromic number.");
        }
        scanner.close();
    }
}
