import java.util.Scanner;

public class ShortestLongestWordProgram {

    // c. Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // b. Method to split text using charAt() (without split())
    public static String[] splitText(String text) {

        int length = findLength(text
