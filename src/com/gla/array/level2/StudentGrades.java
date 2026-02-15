package com.gla.array.level2;


    import java.util.Scanner;

    public class StudentGrades {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();

            double[] physics = new double[n];
            double[] chemistry = new double[n];
            double[] maths = new double[n];
            double[] percentage = new double[n];
            String[] grade = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Physics: ");
                physics[i] = sc.nextDouble();
                System.out.print("Chemistry: ");
                chemistry[i] = sc.nextDouble();
                System.out.print("Maths: ");
                maths[i] = sc.nextDouble();

                percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

                if (percentage[i] >= 90)
                    grade[i] = "A";
                else if (percentage[i] >= 75)
                    grade[i] = "B";
                else if (percentage[i] >= 60)
                    grade[i] = "C";
                else
                    grade[i] = "D";
            }

            for (int i = 0; i < n; i++) {
                System.out.println("Percentage: " + percentage[i] +
                        " Grade: " + grade[i]);
            }

            sc.close();
        }
    }


