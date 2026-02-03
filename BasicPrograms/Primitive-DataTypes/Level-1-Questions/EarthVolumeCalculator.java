public class EarthVolumeCalculator {
 public static void main(String[] args) {
        
        final double radiusKm = 6378.0;
		final double kmToMiles = 0.621371;
	
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
		double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.printf("The volume of earth in cubic kilometers is %.15f and cubic miles is %.15f%n", volumeKm3, volumeMiles3);
    }
}