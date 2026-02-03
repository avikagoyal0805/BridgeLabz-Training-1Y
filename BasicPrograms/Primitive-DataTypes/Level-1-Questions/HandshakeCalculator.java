import java.util.Scanner;

public class HandshakeCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students (N): ");
        int numberOfStudents = scanner.nextInt();
		
		if (numberOfStudents < 0) {
            System.out.println("Error: Number of students cannot be negative.");
        } 
		else {
           long handshakes = (long) numberOfStudents * (numberOfStudents - 1) / 2;
		    System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);
        }
    }
}
