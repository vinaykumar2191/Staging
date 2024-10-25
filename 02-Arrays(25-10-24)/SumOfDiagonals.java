package staging_area.Array_Problems;

import java.util.Scanner;

public class SumOfDiagonals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the matrix : ");
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		
		System.out.println("Enter elements in matrix : ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int sumOfDiagnols = 0;
		
		for(int i=0; i<n; i++) {
			sumOfDiagnols += matrix[i][i];
		}
		System.out.println("The sum of diagnols is : " + sumOfDiagnols);
		
		sc.close();
	}
}
