// 35. Write a program to check if a given number is a pronic number.

import java.util.Scanner;

public class PronicNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPronic = isPronicNumber(num);


        if (isPronic) {
            System.out.println(num + " is a pronic number.");
        } else {
            System.out.println(num + " is not a pronic number.");
        }
        scanner.close();
    }

    public static boolean isPronicNumber(int num) {
        for (int i = 0; i <= Math.sqrt(num); i++) {
            if (i * (i + 1) == num) {
                return true;
            }
        }
        return false;
    }
}
