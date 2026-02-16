import java.util.Scanner;

public class SmallestCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
           
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter third number: ");
            double num3 = sc.nextDouble();

            
            boolean isSmallest = (num1 < num2) && (num1 < num3);

            
            System.out.println("Is the first number the smallest? " + isSmallest);
			
			 } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values only.");

        } finally {
            sc.close();
        }
    }
}
