package com.netcracker.homework.ch1.ex2;

import java.util.Scanner;

public class Angle {
    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int normalization = ((number % 360) + 360) % 360;

        int normalizationFloorMood = Math.floorMod(number, 360);

        System.out.println("normalization : " + normalization + " degrees");
        System.out.println("normalizationFloorMood : " + normalizationFloorMood + " degrees");
    }
}

