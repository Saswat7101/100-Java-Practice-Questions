// 41. Write a program to count and calculate the sum of digits in a given number.

import java.util.Scanner;

public class CountAndSumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int count = countDigits(num);
        int sum = sumOfDigits(num);
        System.out.println("Number of digits: " + count);
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
