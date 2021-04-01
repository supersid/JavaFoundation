/*
 * Display 2D array into matrix format.
 * This is a demo program to learn how to take input and show output for 2D array.
 */
package multiDimensionArrays;

import java.util.Scanner;

public class MultiDimensionArrayDemo {

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
		display2DArray(arr);
	}

	public static void display2DArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
