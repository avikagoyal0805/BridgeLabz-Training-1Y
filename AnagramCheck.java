import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    static boolean isAnagram(String s1, String s2) {
        char[] arr1 = s1.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] arr2 = s2.replaceAll("\\s+", "").toLowerCase().toCharArray();
        if (arr1.length != arr2.length) return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        if (isAnagram(s1, s2)) System.out.println("Strings are anagrams");
        else System.out.println("Strings are not anagrams");
    }
}
