import java.util.Scanner;

public class WordLength2D {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count++);
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++)
            if (text.charAt(i) == ' ')
                wordCount++;

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++)
                    word += text.charAt(j);
                words[index++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] result = wordWithLength(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));
        }
    }
}
