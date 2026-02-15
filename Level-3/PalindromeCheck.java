import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1
    public static boolean isPalindrome(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // Logic 2 Recursive
    public static boolean isPalindromeRec(String text, int start, int end) {

        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return isPalindromeRec(text, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Logic 1: " + isPalindrome(text));
        System.out.println("Logic 2: " + isPalindromeRec(text, 0, text.length() - 1));

        sc.close();
    }
}
