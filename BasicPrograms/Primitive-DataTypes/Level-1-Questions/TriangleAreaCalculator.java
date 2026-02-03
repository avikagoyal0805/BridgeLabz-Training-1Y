import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in inches: ");
        double baseInInches = sc.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");
        double heightInInches = sc.nextDouble();
		double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        
        final double SqINCHtoSqCM = 6.4516; // 2.54 * 2.54
        double areaInSquareCentimeters = areaInSquareInches * SqINCHtoSqCM;

        
        System.out.println("Area of the triangle in square inches: " + areaInSquareInches + " sq. inches");
        System.out.println("Area of the triangle in square centimeters: " + areaInSquareCentimeters + " sq. cm");
    }
}