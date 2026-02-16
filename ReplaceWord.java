import java.util.Scanner;

public class ReplaceWord {

    static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Word to replace: ");
        String oldWord = sc.next();
        System.out.print("New word: ");
        String newWord = sc.next();

        System.out.println("Modified sentence: " + replaceWord(sentence, oldWord, newWord));
    }
}
