package com.netcracker.homework.ch1.ex8;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputStringArray = scanner.nextLine().split(" ");

        StringBuffer string = new StringBuffer();
        for (int i = 0; i < inputStringArray.length; i++) {
            string.append(inputStringArray[i]);
        }
        substring(string);
    }

    static void substring(StringBuffer string) {
        for (int i = 0; i < string.length(); i++) {
            String substring = new String();
            System.out.print("\n" + Character.toUpperCase(string.charAt(i)) + ": ");

            for (int j = i; j < string.length(); j++) {
                substring += string.charAt(j);
                System.out.print(substring + " ");
            }

        }
    }
}
