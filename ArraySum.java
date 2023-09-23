// 10. Write a program to calculate the sum of elements in an array.

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements: " + sum);
    }
}
