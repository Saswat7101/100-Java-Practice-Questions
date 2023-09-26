// 11. Write a program to rotate the elements of an array to the left by a given number of positions.

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int positions = 2;
        int n = arr.length;
        int[] rotatedArr = new int[n];
        for (int i = 0; i < n; i++) {
            int newPosition = (i + n - positions) % n;
            rotatedArr[newPosition] = arr[i];
        }
        System.out.print("Rotated array: ");
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }
}
