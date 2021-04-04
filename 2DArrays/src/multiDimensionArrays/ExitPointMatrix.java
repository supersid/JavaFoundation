package multiDimensionArrays;

import java.util.Scanner;

public class ExitPointMatrix {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		scn.close();
		findExitPoint(arr);
	}

	public static void findExitPoint(int[][] arr) {
		int i = 0;
		int j = 0;
		int direction = 0;

		while (true) {
			direction = (direction + arr[i][j]) % 4; // whenever we get value as '1' we have to change the direction
			if (direction == 0) { // east direction
				j++;
			} else if (direction == 1) { // south direction
				i++;
			} else if (direction == 2) { // west direction
				j--;
			} else if (direction == 3) { // north direction
				i--;
			}
			if (i == arr.length) {
				i--;
				break;
			} else if (j == arr[0].length) {
				j--;
				break;
			} else if (i < 0) {
				i++;
				break;
			} else if (j < 0) {
				j++;
				break;
			}
		}
		System.out.println(i);
		System.out.println(j);
	}
}
