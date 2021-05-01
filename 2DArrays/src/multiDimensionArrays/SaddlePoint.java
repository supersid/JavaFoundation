/*
 * You are given a square matrix of size 'n'. You are given n*n elements of the square matrix. 
 * You are required to find the saddle price of the given matrix and print the saddle price. 
 * The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
 */
package multiDimensionArrays;

import java.util.Scanner;

public class SaddlePoint {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		scn.close();
		findSaddlePoint(arr);
	}

	public static void findSaddlePoint(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min_col = 0;
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] < arr[i][min_col]) {
					min_col = j; // potential location for minimum col value
				}
			}
			boolean psp = true;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j][min_col] > arr[i][min_col]) {
					psp = false;
				}
			}
			if (psp == true) {
				System.out.println(arr[i][min_col]);
				return;
			}
		}
		System.out.println("Invalid input");
	}
}
