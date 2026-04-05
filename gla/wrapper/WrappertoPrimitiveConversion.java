package com.gla.wrapper;

public class WrappertoPrimitiveConversion {


        public static void main(String[] args) {
            Double obj = 45.67;

            // Conversions
            double d = obj;          // auto-unboxing
            int i = (int) d;         // casting to int

            // Output
            System.out.println("Double object value: " + obj);
            System.out.println("Primitive double value: " + d);
            System.out.println("Primitive int value: " + i);
        }
    }

