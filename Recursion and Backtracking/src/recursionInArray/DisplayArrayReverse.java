package recursionInArray;

import java.util.Scanner;

public class DisplayArrayReverse {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		scn.close();
		displayArrReverse(arr, n-1);
	}

	public static void displayArrReverse(int[] arr, int idx) {
		if(idx < 0) {
			return;
		}
		System.out.println(arr[idx]);
		displayArrReverse(arr, idx - 1);
	}

}
