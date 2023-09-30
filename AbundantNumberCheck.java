// 50. Write a program to check if a given number is an abundant number.

import java.util.Scanner;

public class AbundantNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isAbundant = isAbundantNumber(num);
        if (isAbundant) {
            System.out.println(num + " is an abundant number.");
        } else {
            System.out.println(num + " is not an abundant number.");
        }
        scanner.close();
    }

    public static boolean isAbundantNumber(int num) {
        int sumOfDivisors = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors > num;
    }
}
