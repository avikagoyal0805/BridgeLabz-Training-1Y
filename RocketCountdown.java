import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer to start the countdown: ");
        int counter = scanner.nextInt();
        scanner.close();

        System.out.println("\nInitiating Countdown:");

        
        if (counter <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
			while (counter >= 1) {
            
            System.out.println(counter);
            counter--; 

        System.out.println("Rocket Launch!");
    }
}
