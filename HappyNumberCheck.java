// 33. Write a program to check if a given number is a happy number.

import java.util.HashSet;

public class HappyNumberCheck {
    public static void main(String[] args) {
        int num = 19;
        boolean isHappy = isHappyNumber(num);
        if (isHappy) {
            System.out.println(num + " is a happy number.");
        } else {
            System.out.println(num + " is not a happy number.");
        }
    }

    public static boolean isHappyNumber(int num) {
        HashSet<Integer> seen = new HashSet<>();
        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            num = getNextNumber(num);
        }
        return num == 1;
    }

    public static int getNextNumber(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
