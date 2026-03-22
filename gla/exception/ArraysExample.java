package com.gla.exception;


    import java.util.*;

    public class ArraysExample {
        public static void main(String[] args) {
            try {
                int[] arr = {10, 20, 30};
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter index: ");
                int index = sc.nextInt();

                System.out.println("Value at index " + index + ": " + arr[index]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index!");
            } catch (NullPointerException e) {
                System.out.println("Array is not initialized!");
            }
        }
    }

