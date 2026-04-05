package com.gla.wrapper;

public class WrapperAutoExample {
    public static void main(String[] args){
        //autoboxing
        int a=10;
        Integer i=a; //Manual approach
        //Integer i=Integer.vaueof(a);//compiler will run internally
        System.out.println("Value: "+i);
        System.out.println("_______________");

        Integer b=20;
        int m=b;
        System.out.println("Unboxing: "+m);


    }
}
