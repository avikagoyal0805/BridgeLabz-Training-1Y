package com.gla.wrapper;

public class wrapperExample {
    public static void main(String[] args){
        //autoboxing
        float a=10.99f;
        Float f=a; //Manual approach
        //Integer i=Integer.vaueof(a);//compiler will run internally
        System.out.println("Value: "+f);
        System.out.println("_______________");

        float b=20.99f;
        Float m=b;
        System.out.println("Unboxing: "+m);


    }
}


