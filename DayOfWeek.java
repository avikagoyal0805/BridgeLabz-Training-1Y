public class DayOfWeek {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (m < 3) {
            m = m + 12;
            y = y - 1;
        }

        int K = y % 100;
        int J = y / 100;

        int h = (d + (13*(m + 1))/5 + K + K/4 + J/4 + 5*J) % 7;

        int dayOfWeek = ((h + 6) % 7); // Convert to 0=Sunday

        System.out.println("Day of Week (0=Sun, 1=Mon...): " + dayOfWeek);
    }
}
