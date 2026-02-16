import java.util.Scanner;
public class LargestNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        boolean firstLargest = (num1 > num2) && (num1 > num3);
		boolean secondLargest = (num2 > num1) && (num2 > num3);
        boolean thirdLargest = (num3 > num1) && (num3 > num2);

        System.out.println("Is the first number the largest? " +firstLargest);
        System.out.println("Is the second number the largest? " +secondLargest);
        System.out.println("Is the third number the largest? " +thirdLargest);

        sc.close();
    }
}
