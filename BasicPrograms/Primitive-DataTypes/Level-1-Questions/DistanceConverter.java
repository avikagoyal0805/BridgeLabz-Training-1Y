public class DistanceConverter {
    public static void main(String[] args) {
        
       double kilometers = 10.8;
       double milesPerKilometer = 0.621371; 
      
       double miles = kilometers * milesPerKilometer;
       System.out.println(String.format("The distance %.1f km in miles is %.2f", kilometers, miles));
    }
}
