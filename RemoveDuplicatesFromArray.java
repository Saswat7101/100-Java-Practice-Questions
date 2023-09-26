// 12. Write a program to remove duplicate elements from an array.

import java.util.Arrays;
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
        int n = arr.length;
        int newSize = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[newSize++] = arr[i];
            }
        }
        int[] newArray = Arrays.copyOf(arr, newSize);
        System.out.print("Array with duplicates removed: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
