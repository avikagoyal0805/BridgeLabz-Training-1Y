package com.gla.exception;
import java.util.Scanner;

    public class DivisionDemo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Enter first integer: ");
                int a = sc.nextInt();

                System.out.print("Enter second integer: ");
                int b = sc.nextInt();

                int result = a / b;  // May throw ArithmeticException
                System.out.println("Result: " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.");
            }
            finally {
                System.out.println("Operation completed");
            }

            sc.close();
        }
    }

