package com.netcracker.homework.ch3.ex4;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);

        IntSequence intSequence = IntSequence.of(3, 1.0, 4, 1, 5.6, 9);
        while (intSequence.hasNext()) {
            System.out.print(format.format(intSequence.next()) + " ");
        }
    }
}
