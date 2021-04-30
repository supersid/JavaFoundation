/*
 * You are given a number n1, representing the number of rows of 1st matrix.
 * You are given a number m1, representing the number of columns of 1st matrix.
 * You are given n1*m1 numbers, representing elements of 2d array a1.
 * You are given a number n2, representing the number of rows of 2nd matrix.
 * You are given a number m2, representing the number of columns of 2nd matrix.
 * You are given n2*m2 numbers, representing elements of 2d array a2.
 * If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, display the contents of prd array as specified in output Format.
 * If the two arrays can't be multiplied, print "Invalid input".
 */
package multiDimensionArrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt(); // r1
		int m1 = scn.nextInt(); // c2

		int[][] a1 = new int[n1][m1];
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < m1; j++) {
				a1[i][j] = scn.nextInt();
			}
		}

		int n2 = scn.nextInt();  // r2
		int m2 = scn.nextInt(); // c2

		int[][] a2 = new int[n2][m2];
		for (int i = 0; i < n2; i++) {
			for (int j = 0; j < m2; j++) {
				a2[i][j] = scn.nextInt();
			}
		}

		if (m1 == n2) { // if c1 = r2
			matrixMultiplication(a1, a2, m1);
		} else {
			System.out.print("Invalid input");
		}
		scn.close();
	}

	public static void matrixMultiplication(int[][] a1, int[][] a2, int m1) {
		// size of result array should be r1c2
		int[][] prod = new int[a1.length][a2[0].length];

		for (int i = 0; i < prod.length; i++) { // loop to access result array row
			for (int j = 0; j < prod[i].length; j++) { // loop to access result array col
				for (int k = 0; k < m1; k++) { // the loop should go to either c1 or r2
					prod[i][j] = prod[i][j] + a1[i][k] * a2[k][j];
				}
			}
		}

		// display result
		for (int i = 0; i < prod.length; i++) {
			for (int j = 0; j < prod[0].length; j++) {
				System.out.print(prod[i][j] + " ");
			}
			System.out.println();
		}
	}
}
