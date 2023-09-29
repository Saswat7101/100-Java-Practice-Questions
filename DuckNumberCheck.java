// 38. Write a program to check if a given number is a duck number.

import java.util.Scanner;

public class DuckNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numStr = scanner.nextLine();
        boolean isDuck = isDuckNumber(numStr);
        if (isDuck) {
            System.out.println(numStr + " is a duck number.");
        } else {
            System.out.println(numStr + " is not a duck number.");
        }
        scanner.close();
    }

    public static boolean isDuckNumber(String numStr) {
        return numStr.charAt(0) != '0' && numStr.contains("0");
    }
}
