public class AverageCalculator {
public static void main(String[] args) {

	int mathsMarks = 94;
	int physicsMarks = 95;
	int chemistryMarks = 96;
	int totalMarksObtained = mathsMarks + physicsMarks + chemistryMarks;
	int totalPossibleMarks = 300;
	double averagePercent = ((double) totalMarksObtained / totalPossibleMarks) * 100;
	
System.out.println("Sam's average marks in PCM is " + averagePercent + "%");
}
} 