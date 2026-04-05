package com.gla.wrapper;


    public class GameScores {
        public static void main(String[] args) {
            Integer[] scores = {100, null, 200, null, 150};

            int total = 0;
            int notPlayed = 0;

            for (Integer score : scores) {
                if (score == null) {
                    notPlayed++;
                } else {
                    total += score; // auto-unboxing
                }
            }

            System.out.println("Players not played: " + notPlayed);
            System.out.println("Total score: " + total);
        }
    }

