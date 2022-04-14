package com.netcracker.homework.ch1.ex6;

import java.math.BigInteger;

public class Factorial {
        public static void main(String[] args) {

            BigInteger number = new BigInteger("1000");

            for (BigInteger i = number; i.compareTo(BigInteger.ZERO) >= 0; i = i.subtract(BigInteger.ONE)) {
                System.out.println(i + "! = " + factorial(i));
            }
        }

        static BigInteger factorial(BigInteger i)
        {

            if  (i.compareTo(BigInteger.ONE) <= 0) {
                return BigInteger.ONE;
            }

            return i.multiply(factorial(i.subtract(BigInteger.ONE)));
        }
}
