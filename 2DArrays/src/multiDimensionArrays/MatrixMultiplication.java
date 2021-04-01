package multiDimensionArrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int m1 = scn.nextInt();

		int[][] a1 = new int[n1][m1];
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < m1; j++) {
				a1[i][j] = scn.nextInt();
			}
		}

		int n2 = scn.nextInt();
		int m2 = scn.nextInt();

		int[][] a2 = new int[n2][m2];
		for (int i = 0; i < n2; i++) {
			for (int j = 0; j < m2; j++) {
				a2[i][j] = scn.nextInt();
			}
		}

		if (m1 == n2) {
			matrixMultiplication(a1, a2, m1);
		} else {
			System.out.print("Invalid input");
		}
		scn.close();
	}

	public static void matrixMultiplication(int[][] a1, int[][] a2, int m1) {
		int[][] prod = new int[a1.length][a2[0].length];

		for (int i = 0; i < prod.length; i++) {
			for (int j = 0; j < prod[i].length; j++) {
				for (int k = 0; k < m1; k++) {
					prod[i][j] = prod[i][j] + a1[i][k] * a2[k][j];
				}
			}
		}

		for (int i = 0; i < prod.length; i++) {
			for (int j = 0; j < prod[0].length; j++) {
				System.out.print(prod[i][j] + " ");
			}
			System.out.println();
		}
	}
}
