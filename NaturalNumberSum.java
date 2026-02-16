import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        
        while (true) {
            System.out.print("Enter a positive integer (natural number) for n: ");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input > 0) {
                    n = input;
                    break; 
                } else {
                    System.out.println("Error: Please enter a positive integer.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.next(); 
            }
        }
        scanner.close();

        long sumWhileLoop = 0;
        int count = 1;
        while (count <= n) {
            sumWhileLoop += count;
            count++;
        }
        long sumFormula = (long) n * (n + 1) / 2;
        System.out.println("\nSum computed with while loop: " + sumWhileLoop);
        System.out.println("Sum computed with formula: " + sumFormula);

        if (sumWhileLoop == sumFormula) {
            System.out.println("Result: The results from both are correct.");
        } else {
            System.out.println("Result: The results do not match.");
        }
    }
}
