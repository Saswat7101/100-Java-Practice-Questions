// 19. Write a program to reverse the elements of an array.

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];


            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
