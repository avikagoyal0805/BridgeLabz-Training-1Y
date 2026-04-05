package com.gla.wrapper;
import java.util.*;
public class SensorLogger {

        public static void logTemperature(Double temp) {
            System.out.println("Logged temperature: " + temp);
        }

        public static void main(String[] args) {
            double primitiveTemp = 25.5;
            Double wrapperTemp = 30.2;

            // Auto-boxing
            logTemperature(primitiveTemp);

            // Direct wrapper
            logTemperature(wrapperTemp);
        }
    }

