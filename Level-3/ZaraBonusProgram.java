
public class ZaraBonusProgram {

    // b) Method to generate salary and years of service
    public static double[][] generateEmployeeData(int size) {

        double[][] data = new double[size][2]; 
        // Column 0 -> Salary
        // Column 1 -> Years of Service

        for (int i = 0; i < size; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // 5-digit salary (10000–99999)
            data[i][1] = (int)(Math.random() * 10) + 1;        // 1–10 years of service
        }

        return data;
    }

    // c) Method to calculate bonus and new salary
    public static double[][] calculateBonus(double[][] data) {

        double[][] result = new double[data.length][3];
        // Column 0 -> Old Salary
        // Column 1 -> Bonus
        // Column 2 -> New Salary

        for (int i = 0; i < data.length; i++) {

            double salary = data[i][0];
            double years = data[i][1];
            double bonus;

            if (years > 5)
                bonus = salary * 0.05;   // 5%
            else
                bonus = salary * 0.02;   // 2%

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = salary + bonus;
        }

        return result;
    }

    // d) Method to display totals in tabular format
    public static void displayResults(double[][] data, double[][] result) {

        double totalOld = 0;
        double totalBonus = 0;
        double totalNew = 0;

        System.out.println("Emp\tSalary\tYears\tBonus\tNew Salary");

        for (int i = 0; i < data.length; i++) {

            System.out.println((i + 1) + "\t" +
                    result[i][0] + "\t" +
                    data[i][1] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2]);

            totalOld += result[i][0];
            totalBonus += result[i][1];
            totalNew += result[i][2];
        }

        System.out.println("\n------------------------------------------");
        System.out.println("Total Old Salary  : " + totalOld);
        System.out.println("Total Bonus Paid  : " + totalBonus);
        System.out.println("Total New Salary  : " + totalNew);
    }

    public static void main(String[] args) {

        int employees = 10;

        // Generate employee data
        double[][] employeeData = generateEmployeeData(employees);

        // Calculate bonus
        double[][] bonusData = calculateBonus(employeeData);

        // Display results
        displayResults(employeeData, bonusData);
    }
}
