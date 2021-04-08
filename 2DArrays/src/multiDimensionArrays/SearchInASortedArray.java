package multiDimensionArrays;

import java.util.Scanner;

public class SearchInASortedArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		int x = scn.nextInt();
		scn.close();
		findIndex(arr, x);
	}

	/*
	 * Method 1 done by me
	public static void findIndex(int[][] arr, int x) {
		boolean foundIndex = false;
		for (int i = 0; i < arr.length; i++) {
			int col = arr[i].length - 1;
			if (x <= arr[i][col]) {
				while (col >= 0) {
					if (x == arr[i][col]) {
						System.out.println(i);
						System.out.println(col);
						foundIndex = true;
						break;
					} else {
						col--;
					}
				}
			}
			if (foundIndex) {
				break;
			}
		}
		if (!foundIndex) {
			System.out.println("Not Found");
		}
	}
	*/
	
	public static void findIndex(int[][] arr, int x) {
		int i = 0;
		int j = arr[0].length - 1;
		while(i < arr.length && j >= 0) {
			if(x == arr[i][j]) {
				System.out.println(i);
				System.out.println(j);
				return;
			} else if(x < arr[i][j]) {
				j--;
			} else {
				i++;
			}
		}
		System.out.println("Not Found");
	}
	
}
