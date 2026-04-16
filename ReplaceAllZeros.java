package com.gla.workshop;

public class ReplaceAllZeros {
    public static void main(String[] args){

                int num = 105000;

                String result = String.valueOf(num).replace('0', '1');
                int finalResult = Integer.parseInt(result);

                System.out.println(finalResult); // Output: 112131
            }
        }


