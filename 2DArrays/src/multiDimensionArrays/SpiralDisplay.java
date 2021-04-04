package multiDimensionArrays;

import java.util.Scanner;

public class SpiralDisplay {

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
		spiralDisplay(arr, n, m);
	}
	public static void spiralDisplay(int[][] arr, int n, int m) {
		// Values to manipulate start and end points for display
		int minr = 0;
		int minc = 0;
		int maxr = n - 1;
		int maxc = m - 1;
		int total = m * n;
		int count = 0;
		
		// In every for loop we specify the start value in i and j since this is an 2d array
		while(count < total) { // to make sure we iterate over each and every element
			// left wall
			for(int i = minr,  j = minc; i <= maxr && count < total; i++) {
				System.out.println(arr[i][j]);
				count++;
			}
			minc++;
			// bottom wall
			for(int i = maxr, j = minc; j <= maxc && count < total; j++) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxr--;
			// right wall
			for(int i = maxr, j = maxc; i >= minr && count < total; i--) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxc--;
			// top wall
			for(int i = minr, j = maxc; j >= minc && count < total; j--) {
				System.out.println(arr[i][j]);
				count++;
			}
			minr++;
		}
	}
}
