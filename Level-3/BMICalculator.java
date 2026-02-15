import java.util.Scanner;

public class BMICalculator {

    // b. Method to calculate BMI and Status
    public static String[][] calculateBMI(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightMeters = data[i][1] / 100.0;

            double bmi = weight / (heightMeters * heightMeters);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;

            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 30)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(data[i][1]); // height
            result[i][1] = String.valueOf(weight);     // weight
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    // d. Display method
    public static void display(String[][] result) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" +
                               result[i][1] + "\t\t" +
                               result[i][2] + "\t" +
                               result[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = calculateBMI(data);
        display(result);
        sc.close();
    }
}
