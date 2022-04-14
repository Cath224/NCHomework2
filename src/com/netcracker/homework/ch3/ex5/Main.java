package com.netcracker.homework.ch3.ex5;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);

        IntSequence intSequence = IntSequence.constant(1);

        //with lambda expression
        while (true) {
            System.out.print(format.format(intSequence.next()) + " , ");
        }

        //without lambda expression

/*            while (intSequence.hasNext()) {
                System.out.print(format.format(intSequence.next()) + " , ");
            }*/
    }
}
