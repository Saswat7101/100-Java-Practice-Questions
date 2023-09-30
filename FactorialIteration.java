// 44. Write a program to calculate the factorial of a number using iteration.

import java.util.Scanner;

public class FactorialIteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        long factorial = calculateFactorial(num);
        System.out.println(num + "! = " + factorial);
        scanner.close();
    }

    public static long calculateFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
