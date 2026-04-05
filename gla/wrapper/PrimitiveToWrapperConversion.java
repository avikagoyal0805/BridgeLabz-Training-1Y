package com.gla.wrapper;
import java.util.Scanner;

public class PrimitiveToWrapperConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: " );
        int num= sc.nextInt();

        Integer i = Integer.valueOf(num);

        System.out.println("Primitive value: " +num);
        System.out.println("Integer value: " +i);

        sc.close();
    }
}
