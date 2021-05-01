// Example input
//	11	12	13	14
//	21	22	23	24
//	31	32	33	34
//	41	42	43	44
// Output
//	11
//	22
//	33
//	44
//	12
//	23
//	34
//	13
//	24
//	14
package multiDimensionArrays;

import java.util.Scanner;

public class DiagonalTraversal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		scn.close();
		displayDiagonalTraversal(arr);
	}

	public static void displayDiagonalTraversal(int[][] arr) {
		for (int g = 0; g < arr.length; g++) {
			for (int i = 0, j = g; j < arr[0].length; i++,j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
