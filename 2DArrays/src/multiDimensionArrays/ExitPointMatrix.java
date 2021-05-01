/*
 * You are given a number n, representing the number of rows.
 * You are given a number m, representing the number of columns.
 * You are given n*m numbers (1's and 0's), representing elements of 2d array a.
 * Consider this array a maze and a player enters from top-left corner in east direction.
 * The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
 * You are required to print the indices in (row, col) format of the point from where you exit the matrix.
 */
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
			direction = (direction + arr[i][j]) % 4; // whenever we get arr[i][j] as '1' we have to change the direction
			if (direction == 0) { // east direction
				j++;
			} else if (direction == 1) { // south direction
				i++;
			} else if (direction == 2) { // west direction
				j--;
			} else if (direction == 3) { // north direction
				i--;
			}
			// We have to move until we reach an exit.
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
