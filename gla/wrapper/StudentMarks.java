package com.gla.wrapper;


    import java.util.*;

    public class StudentMarks {
        public static void main(String[] args) {
            Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc"};

            ArrayList<Integer> validMarks = new ArrayList<>();

            for (Object obj : inputs) {
                try {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!str.equals("null")) {
                            validMarks.add(Integer.parseInt(str));
                        }
                    } else if (obj instanceof Integer) {
                        validMarks.add((Integer) obj);
                    }
                } catch (Exception e) {
                    // ignore invalid
                }
            }

            int sum = 0;
            for (int m : validMarks) {
                sum += m;
            }

            double avg = (double) sum / validMarks.size();

            System.out.println("Average marks: " + avg);
        }
    }

