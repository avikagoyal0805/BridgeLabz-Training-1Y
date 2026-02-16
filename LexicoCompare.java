import java.util.Scanner;

public class LexicoCompare {

    static String compareStrings(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) < str2.charAt(i) ?
                        str1 + " comes before " + str2 :
                        str1 + " comes after " + str2;
            }
        }
        if (str1.length() == str2.length()) return "Both strings are equal";
        return str1.length() < str2.length() ? 
               str1 + " comes before " + str2 : 
               str1 + " comes after " + str2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        String s2 = sc.nextLine();

        System.out.println(compareStrings(s1, s2));
    }
}
