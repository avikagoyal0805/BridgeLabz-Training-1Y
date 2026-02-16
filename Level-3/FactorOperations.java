import java.util.Scanner;

public class FactorOperations {

    public static int[] findFactors(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++)
            if (num % i == 0)
                count++;

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++)
            if (num % i == 0)
                factors[index++] = i;

        return factors;
    }

    public static int greatestFactor(int[] arr) {
        return arr[arr.length - 1];
    }

    public static int sumFactors(int[] arr) {
        int sum = 0;
        for (int n : arr)
            sum += n;
        return sum;
    }

    public static int productFactors(int[] arr) {
        int product = 1;
        for (int n : arr)
            product *= n;
        return product;
    }

    public static double productCubeFactors(int[] arr) {
        double product = 1;
        for (int n : arr)
            product *= Math.pow(n, 3);
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.print("Factors: ");
        for (int f : factors)
            System.out.print(f + " ");

        System.out.println("\nGreatest Factor: " + greatestFactor(factors));
        System.out.println("Sum: " + sumFactors(factors));
        System.out.println("Product: " + productFactors(factors));
        System.out.println("Product of Cubes: " + productCubeFactors(factors));

        sc.close();
    }
}
