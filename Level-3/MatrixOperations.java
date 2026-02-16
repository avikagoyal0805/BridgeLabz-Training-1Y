public class MatrixOperations {

    // a) Method to create random matrix
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); // Random numbers 0–9
            }
        }
        return matrix;
    }

    // Method to display matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // b) Addition of two matrices
    public static int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];

        return result;
    }

    // c) Subtraction of two matrices
    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];

        return result;
    }

    // d) Multiplication of two matrices
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int common = B.length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        int rows = 2;
        int cols = 2;

        // Create two random matrices
        int[][] matrixA = createMatrix(rows, cols);
        int[][] matrixB = createMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        // Addition
        System.out.println("Addition (A + B):");
        displayMatrix(addMatrix(matrixA, matrixB));

        // Subtraction
        System.out.println("Subtraction (A - B):");
        displayMatrix(subtractMatrix(matrixA, matrixB));

        // Multiplication
        System.out.println("Multiplication (A × B):");
        displayMatrix(multiplyMatrix(matrixA, matrixB));
    }
}
