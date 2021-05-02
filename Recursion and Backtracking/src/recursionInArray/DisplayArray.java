package recursionInArray;

import java.util.Scanner;

public class DisplayArray {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		scn.close();
		displayArr(arr, 0);
	}

	public static void displayArr(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		displayArr(arr, idx + 1);

	}
}
