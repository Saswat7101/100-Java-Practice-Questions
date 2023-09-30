// 48. Write a program to check if a given string is a prime string.

public class PrimeStringCheck {
    public static void main(String[] args) {
        String str = "abcabcabc";
        boolean isPrime = isPrimeString(str);
        if (isPrime) {
            System.out.println("The string is a prime string.");
        } else {
            System.out.println("The string is not a prime string.");
        }
    }

    public static boolean isPrimeString(String str) {
        int length = str.length();
        for (int i = 1; i < length; i++) {
            if (length % i == 0) {
                String substring = str.substring(0, i);
                StringBuilder primeString = new StringBuilder(substring);
                while (primeString.length() < length) {
                    primeString.append(substring);
                }
                if (primeString.toString().equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }
}
