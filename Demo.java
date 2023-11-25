///Write a Java program that takes in an array of strings and concatenates them into a single string.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Demo {

    String concatenate(ArrayList<String> arr) {
        String concatenatedString = "";

        for (String s : arr) {
            concatenatedString += s;
            concatenatedString += " ";
        }
        return concatenatedString;
    }

    String repeatedCharacters(String concatenatedString) {

        String repeatStrings = "";
        HashSet<String> set = new HashSet();
        StringBuffer sb = new StringBuffer();
        sb.append(concatenatedString);

        for (int i = 0; i < sb.length(); i++) {
            String s = sb.substring(i, i + 1);
            if (set.contains(s)) {
                repeatStrings += s;
            } else {
                set.add(s);
            }
        }
        return repeatStrings;
    }

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

        Demo demo = new Demo();
        String concatenatedString = demo.concatenate(arr);
        System.out.println("Concatenated string is " + concatenatedString);
        String repeatedString = demo.repeatedCharacters(concatenatedString);
        System.out.println("Repeated characters are : " + repeatedString);
        scanner.close();
    }
}
