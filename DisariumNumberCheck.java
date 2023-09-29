// 36. Write a program to check if a given number is a Disarium number.

import java.util.Scanner;

public class DisariumNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isDisarium = isDisariumNumber(num);
        if (isDisarium) {
            System.out.println(num + " is a Disarium number.");
        } else {
            System.out.println(num + " is not a Disarium number.");
        }
        scanner.close();
    }

    public static boolean isDisariumNumber(int num) {
        String numStr = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(numStr.charAt(i)));
            sum += Math.pow(digit, i + 1);
        }
        return sum == num;
    }
}
