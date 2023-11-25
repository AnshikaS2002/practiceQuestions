///Write a Java program that takes in an array of strings and concatenates them into a single string.

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        int cnt = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings you want to concatenate:");
        cnt = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cnt; i++) {
            System.out.print("Enter string: ");
            String curString = scanner.nextLine();
            arr.add(curString);
        }

        String concatenatedString = "";

        for (String s : arr) {
            concatenatedString += s;
            concatenatedString += " ";
        }

        System.out.println("Concatenated string is " + concatenatedString);
        scanner.close();
    }
}
