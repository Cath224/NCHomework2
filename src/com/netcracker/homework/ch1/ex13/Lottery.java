package com.netcracker.homework.ch1.ex13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();

        for (int k = 0; k < 6; k++) {
            List<Integer> arrayList = new ArrayList<>();

            System.out.println( " ");

            for (int i = 0; i < 6; i++) {
                arrayList.add(random.nextInt(49) + 1);
            }

            Collections.sort(arrayList);
            output(arrayList);

            arrayList.remove(random.nextInt(6));

            Collections.sort(arrayList);
            output(arrayList);
        }


    }
    public static void output(List<Integer> arrayList){
        System.out.println(" ");
        for (int j = 0; j < arrayList.size(); j++) {
            System.out.print(arrayList.get(j) + " ");
        }
    }

}
