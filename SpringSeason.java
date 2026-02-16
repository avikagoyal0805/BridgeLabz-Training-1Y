public class SpringSeason {
    public static void main(String[] args) {
       
        if (args.length != 2) {
            System.out.println(" SpringSeason: enter <month> <day>");
            return;
        }

        try {
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);
 
            if (month < 1 || month > 12 || day < 1 || day > 31) {
                System.out.println("Invalid date. Month should be 1-12 and day should be 1-31.");
                return;
            }

            boolean isSpring = (month == 3 && day >= 20) ||
                               (month == 4) ||
                               (month == 5) ||
                               (month == 6 && day <= 20);

            if (isSpring) {
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers for month and day.");
        }
    }
}
