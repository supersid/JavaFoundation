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
					min_col = j;
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
