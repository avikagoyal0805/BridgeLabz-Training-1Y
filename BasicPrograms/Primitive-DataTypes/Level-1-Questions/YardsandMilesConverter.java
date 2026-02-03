import java.util.Scanner;

public class YardsandMilesConverter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the distance in feet: ");

        double distanceInFeet = sc.nextDouble();
        sc.close();
		
        double distanceInYards = distanceInFeet / 3.0;
		double distanceInMiles = distanceInYards / 1760.0;
 
        System.out.printf("Distance in feet: %.2f ft%n", distanceInFeet);
        System.out.printf("Distance in yards: %.2f yd%n", distanceInYards);
        System.out.printf("Distance in miles: %.4f mi%n", distanceInMiles);
    }
}
