package com.gla.workshop;

import java.util.*;

public class RemoveDuplicates {
    public static void main (String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(23);
        al.add(45);
        al.add(45);
        al.add(32);
        al.add(25);
        al.add(25);

        Set<Integer> set = new HashSet<>(al);
        ArrayList<Integer> uniqueList = new ArrayList<>(set);

        System.out.println(uniqueList);

    }
}
