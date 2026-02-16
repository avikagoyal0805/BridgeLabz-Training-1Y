import java.util.Scanner;

public class StudentScorecard {

    // b) Generate random 2-digit PCM marks
    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3]; // Physics, Chemistry, Maths

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 90) + 10; // 10–99
            }
        }
        return marks;
    }

    // c) Calculate total, average and percentage
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][3]; 
        // [0] Total, [1] Average, [2] Percentage

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // d) Display scorecard
    public static void displayScorecard(int[][] marks, double[][] results) {

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a) Input number of students
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // Generate marks
        int[][] marks = generateMarks(students);

        // Calculate results
        double[][] results = calculateResults(marks);

        // Display scorecard
        displayScorecard(marks, results);

        sc.close();
    }
}

