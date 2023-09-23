// 3. Write a program that checks if a given number is even or odd.

import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if(num % 2 == 0){
            System.out.println(num+" is even.");
        } else {
            System.out.println(num+" is odd.");
        }
        scanner.close();
    }
}
