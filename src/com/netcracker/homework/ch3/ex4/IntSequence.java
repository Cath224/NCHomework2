package com.netcracker.homework.ch3.ex4;

public interface IntSequence {
    boolean hasNext();
    double next();

    static IntSequence of(double... numbers) {
        IntSequence intSequence = new IntSequence() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return i < numbers.length;
            }
            @Override
            public double next() {
                return numbers[i++];
            }
        };
        return intSequence;
    }

}
