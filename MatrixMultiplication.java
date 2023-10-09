import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix A
        System.out.println("Enter the number of rows for Matrix A:");
        int rowsA = scanner.nextInt();
        System.out.println("Enter the number of columns for Matrix A:");
        int colsA = scanner.nextInt();
        int[][] matrixA = new int[rowsA][colsA];

        System.out.println("Enter the elements for Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Input matrix B
        System.out.println("Enter the number of rows for Matrix B:");
        int rowsB = scanner.nextInt();
        System.out.println("Enter the number of columns for Matrix B:");
        int colsB = scanner.nextInt();
        int[][] matrixB = new int[rowsB][colsB];

        System.out.println("Enter the elements for Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Check if multiplication is valid
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not valid. The number of columns in Matrix A must be equal to the number of rows in Matrix B.");
        } else {
            // Multiply matrices
            int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

            // Display the result
            System.out.println("Result Matrix:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }

    // Function to multiply two matrices
    private static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }
}