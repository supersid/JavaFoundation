package multiDimensionArrays;

import java.util.Scanner;

public class RotateBy90Degree {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		display(rotate(arr));
	}

	public static int[][] rotate(int[][] arr) {
		arr = reverse(transpose(arr));
		return arr;
	}

	public static int[][] transpose(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		return arr;
	}

	public static int[][] reverse(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length / 2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][arr[0].length - 1 - j];
				arr[i][arr[0].length - 1 - j] = temp;
			}
		}
		return arr;
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
