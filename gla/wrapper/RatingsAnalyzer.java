package com.gla.wrapper;


    import java.util.*;

    public class RatingsAnalyzer {
        public static void main(String[] args) {
            int[] primitiveRatings = {4, 5, 3};
            ArrayList<Integer> objectRatings = new ArrayList<>();
            objectRatings.add(5);
            objectRatings.add(null);
            objectRatings.add(4);

            ArrayList<Integer> combined = new ArrayList<>();

            // Add primitive (auto-boxing)
            for (int r : primitiveRatings) {
                combined.add(r);
            }

            // Add object list
            combined.addAll(objectRatings);

            int sum = 0, count = 0;

            for (Integer r : combined) {
                if (r != null) {
                    sum += r; // auto-unboxing
                    count++;
                }
            }

            double avg = (double) sum / count;

            System.out.println("Average rating: " + avg);
        }
    }

