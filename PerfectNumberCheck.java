// 27. Write a program to check if a given number is a perfect number.

import java.util.Scanner;

public class PerfectNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPerfect = isPerfectNumber(num);
        if (isPerfect) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
        scanner.close();
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 1; // Start with 1 (since every number is divisible by 1)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i == (num / i)) {
                    sum += i;
                } else {
                    sum += (i + num / i);
                }
            }
        }
        return sum == num && num != 1;
    }
}
