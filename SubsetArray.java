package com.gla.workshop;

public class SubsetArray {
            public static void main(String[] args) {
                int arr1[] = {1, 2, 3, 4, 5};
                int arr2[] = {3, 4, 5};

                int count = 0;

                for (int i = 0; i < arr2.length; i++) {
                    for (int j = 0; j < arr1.length; j++) {
                        if (arr2[i] == arr1[j]) {
                            count++;
                            break;
                        }
                    }
                }

                if (count == arr2.length) {
                    System.out.println("Subset of Array 1");
                } else {
                    System.out.println("Not Subset");
                }
            }
        }


