// 47. Write a program to check if a given string is a palindromic string.

public class PalindromicStringCheck {
    public static void main(String[] args) {
        String str = "racecar";
        boolean isPalindromic = isPalindromicString(str);
        if (isPalindromic) {
            System.out.println("The string is a palindromic string.");
        } else {
            System.out.println("The string is not a palindromic string.");
        }
    }

    public static boolean isPalindromicString(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
