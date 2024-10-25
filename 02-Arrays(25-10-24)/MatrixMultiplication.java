package staging_area.Array_Problems;

import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dimensions of Matrix A (n*m): ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] matrixA = new int[n][m];
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            	matrixA[i][j] = sc.nextInt();
            }
        }

 
        System.out.print("Enter dimensions of Matrix B (m p): ");
        int m2 = sc.nextInt();
        int p = sc.nextInt();

        if (m != m2) {
            System.out.println("Matrix multiplication not possible. Columns of A must match rows of B.");
            sc.close();
            return;
        }

        int[][] matrixB = new int[m][p];
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
            	matrixB[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[n][p];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < m; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix after multiplication:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
