import java.util.Scanner;

public class FrequencyNestedLoops {

    
    public static String[] characterFrequency(String text) {

        char[] chars = text.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];

        
        for (int i = 0; i < n; i++) {
            freq[i] = 1;
        }

        
        for (int i = 0; i < n; i++) {
            if (chars[i] == '0') continue; // already counted duplicate

            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate as counted
                }
            }
        }

        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') count++;
        }

        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }

        return result;
    }

    // Method to display the result
    public static void display(String[] data) {
        System.out.println("\nCharacter\tFrequency");
        for (String s : data) {
            System.out.println(s.replace(" : ", "\t\t"));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] freqData = characterFrequency(text);
        display(freqData);

        sc.close();
    }
}
