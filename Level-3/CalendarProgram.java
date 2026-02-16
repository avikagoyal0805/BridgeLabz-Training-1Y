import java.util.Scanner;

public class CalendarProgram {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDays(int month, int year) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeapYear(year))
            return 29;
        return days[month - 1];
    }

    public static int getFirstDay(int month, int year) {
        int d = 1;
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int h = (d + (13*(month+1))/5 + k + k/4 + j/4 + 5*j) % 7;
        return (h + 6) % 7;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and year: ");
        int month = sc.nextInt();
        int year = sc.nextInt();

        String[] months = {"January","February","March","April","May","June",
                           "July","August","September","October","November","December"};

        System.out.println("\n   " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int days = getDays(month, year);

        for (int i = 0; i < firstDay; i++)
            System.out.print("    ");

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0)
                System.out.println();
        }

        sc.close();
    }
}
