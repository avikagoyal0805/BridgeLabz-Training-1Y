package com.gla.wrapper;
import java.util.*;
public class EmployeeAges {
  public static void main(String[] args) {
            int[] ages = {25, 30, 19, 45, 22};

            ArrayList<Integer> list = new ArrayList<>();

            // Convert using auto-boxing
            for (int age : ages) {
                list.add(age);
            }

            int min = Collections.min(list);
            int max = Collections.max(list);

            System.out.println("Youngest: " + min);
            System.out.println("Oldest: " + max);
        }
    }

