package com.netcracker.homework.ch1.ex14;

import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {

        boolean flag = true;

        Scanner scanner = new Scanner(System.in);

        int lengthMatrix = scanner.nextInt();
        double[][] matrix = new double[lengthMatrix][lengthMatrix];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }



        double sumDioMain = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumDioMain += matrix[i][i];
        }

        for (int i = 0; i < matrix.length; i++) {
            double sumRow = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumRow += matrix[i][j];
            }
            if (sumDioMain != sumRow) {
                flag = false;
                break;
            }
        }
        for (int j = 0; j < matrix.length; j++) {
            double sumColumn = 0;
            for (int i = 0; i < matrix.length; i++) {
                sumColumn += matrix[i][j];
            }
            if (sumColumn != sumDioMain) {
                flag = false;
                break;
            }
        }
        double sumDioSec = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumDioSec += matrix[i][matrix.length-i-1];
        }


        if (sumDioSec != sumDioMain) {
            flag = false;
        }

        if (flag == true) {
            System.out.println("Magic");
        } else {
            System.out.println("Not magic");
        }


    }

}
