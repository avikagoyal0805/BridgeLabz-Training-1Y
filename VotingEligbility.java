import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the person's age: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer age.");
            sc.close();
            return;
        }

        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age. Age cannot be negative.");
        } else if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        sc.close();
    }
}
