package com.gla.wrapper;

public class BankLimit {
      public static double getRemainingLimit(Double limit, double withdrawn) {
            if (limit == null) {
                return 0.0;
            }
            return limit - withdrawn; // auto-unboxing
        }

        public static void main(String[] args) {
            System.out.println(getRemainingLimit(1000.0, 200)); // 800.0
            System.out.println(getRemainingLimit(null, 200));   // 0.0
        }
    }

