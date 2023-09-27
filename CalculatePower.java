// 29. Write a program to calculate the result of raising a number to a power.

public class CalculatePower {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 4;
        long result = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }

    public static long calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent % 2 == 0) {
            long halfPower = calculatePower(base, exponent / 2);
            return halfPower * halfPower;
        } else {
            long halfPower = calculatePower(base, (exponent - 1) / 2);
            return base * halfPower * halfPower;
        }
    }
}
