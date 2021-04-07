package multiDimensionArrays;

import java.util.Scanner;

public class ShellRotate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		int s = scn.nextInt();
		int r = scn.nextInt();
		scn.close();
		display(shellRotate(arr, s, r));
	}

	public static int[][] shellRotate(int[][] arr, int s, int r) {
		int[] shellArray = shellToArray(arr, s);
		rotate(shellArray, r);
		arr = ArrayToShell(arr, shellArray, s);
		return arr;
	}

	public static int[][] ArrayToShell(int[][] arr, int[] shellArray, int s) {
		int minr = s - 1;
		int minc = s - 1;
		int maxr = arr.length - s;
		int maxc = arr[0].length - s;
		int index = 0;
		// left wall
		for (int i = minr, j = minc; i <= maxr; i++) {
			arr[i][j] = shellArray[index];
			index++;
		}
		// bottom wall
		for (int i = maxr, j = minc + 1; j <= maxc; j++) {
			arr[i][j] = shellArray[index];
			index++;
		}
		// right wall
		for (int i = maxr - 1, j = maxc; i >= minr; i--) {
			arr[i][j] = shellArray[index];
			index++;
		}
		// top wall
		for (int i = minr, j = maxc - 1; j > minc; j--) {
			arr[i][j] = shellArray[index];
			index++;
		}
		return arr;
	}

	public static void rotate(int[] shellArray, int r) {
		r = r % shellArray.length;
		if (r < 0) {
			r = r + shellArray.length;
		}
		reverse(shellArray, 0, shellArray.length - 1 - r);
		reverse(shellArray, shellArray.length - r, shellArray.length - 1);
		reverse(shellArray, 0, shellArray.length - 1);
	}

	public static void reverse(int[] shellArray, int i, int j) {
		while (i < j) {
			int temp = shellArray[i];
			shellArray[i] = shellArray[j];
			shellArray[j] = temp;
			i++;
			j--;
		}
	}

	public static int[] shellToArray(int[][] arr, int s) {
		int minr = s - 1;
		int minc = s - 1;
		int maxr = arr.length - s;
		int maxc = arr[0].length - s;
		int size = 2 * (maxr - minr + maxc - minc);
		int[] shellArray = new int[size];
		int index = 0;
		// left wall
		for (int i = minr, j = minc; i <= maxr; i++) {
			shellArray[index] = arr[i][j];
			index++;
		}
		// bottom wall
		for (int i = maxr, j = minc + 1; j <= maxc; j++) {
			shellArray[index] = arr[i][j];
			index++;
		}
		// right wall
		for (int i = maxr - 1, j = maxc; i >= minr; i--) {
			shellArray[index] = arr[i][j];
			index++;
		}
		// top wall
		for (int i = minr, j = maxc - 1; j > minc; j--) {
			shellArray[index] = arr[i][j];
			index++;
		}
		return shellArray;
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
