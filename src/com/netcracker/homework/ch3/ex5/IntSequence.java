package com.netcracker.homework.ch3.ex5;

public interface IntSequence {
    //    boolean hasNext();
    double next();

    //with lambda expression
    static IntSequence constant( final double number) {
        return () -> number;

    }

    //without lambda expression

/*    static IntSequence constant( final double number) {
        IntSequence intSequence = new IntSequence() {
            @Override
            public boolean hasNext() {
                return true;
            }
            @Override
            public double next() {
                return number;
            }
        };
        return intSequence;
    }*/
}
