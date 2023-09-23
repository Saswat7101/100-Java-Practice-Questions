// 9. Write a program to find the maximum element in an array of integers.

public class FindMaximumElement {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
    }
}
