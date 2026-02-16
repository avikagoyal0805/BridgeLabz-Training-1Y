
import java.util.Scanner;

public class DistanceAndLine {

    // b) Method to calculate Euclidean distance
    public static double calculateDistance(double x1, double y1,
                                           double x2, double y2) {

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2)
        );

        return distance;
    }

    // c) Method to calculate slope and y-intercept
    public static double[] findLineEquation(double x1, double y1,
                                            double x2, double y2) {

        double[] result = new double[2];  // [0] = slope (m), [1] = intercept (b)

        if (x2 - x1 == 0) {
            System.out.println("The line is vertical. Slope is undefined.");
            return null;
        }

        double m = (y2 - y1) / (x2 - x1);   // slope
        double b = y1 - m * x1;             // y-intercept

        result[0] = m;
        result[1] = b;

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a) Input points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("\nEuclidean Distance = " + distance);

        // Line Equation
        double[] line = findLineEquation(x1, y1, x2, y2);

        if (line != null) {
            System.out.println("Slope (m) = " + line[0]);
            System.out.println("Y-Intercept (b) = " + line[1]);
            System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);
        }

        sc.close();
    }
}
