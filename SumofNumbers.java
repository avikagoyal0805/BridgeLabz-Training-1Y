import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        
        double total = 0.0;
        double inputNum;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numbers to sum. Enter 0 to display the total and exit.");

        do {
           
            System.out.print("Enter a number: ");
            
            if (scanner.hasNextDouble()) {
                inputNum = scanner.nextDouble();
                
                if (inputNum != 0) {
                   total += inputNum;
                }
				
            } else {
                
                System.out.println("Invalid input. Please enter a valid number or 0 to exit.");
                scanner.next(); // Clear the invalid input
                inputNum = -1; // Set inputNum to a non-zero value to continue the loop
            }

        } while (inputNum != 0);
		scanner.close();
		System.out.println("The total sum of the numbers entered is: " + total);
    }
}
