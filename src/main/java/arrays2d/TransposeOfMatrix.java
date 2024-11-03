package arrays2d;

import java.util.Scanner;

/**
 * Author: Prasant
 * Date: 02/11/24
 */

public class TransposeOfMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter row size: ");
		int row = sc.nextInt();

		System.out.println("Enter col size: ");
		int col = sc.nextInt();

		// Taking 2d array input
		int [][] matrix = new int[row][col];
		for (int i = 0; i < matrix.length; i++){

			System.out.println("Enter row values: ");
			for (int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = sc.nextInt();
			}
			System.out.println();

		}

		// Transpose logic -
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < i; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		// Printing 2D array
		for (int i = 0; i < matrix.length; i++){

			for (int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}

	}
}
