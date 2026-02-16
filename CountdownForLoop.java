import java.util.Scanner;

public class CountdownForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number for the countdown: ");
        
        // Read the user's input as an integer
        int counter = scanner.nextInt();
        
        
        for (int i = counter; i > 0; i--) {
            System.out.println(i);
        }
        
        
        System.out.println("LAUNCHED!");

        scanner.close(); 
    }
}
