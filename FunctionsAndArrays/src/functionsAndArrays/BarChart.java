package functionsAndArrays;

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
			if(i == 0) {
				max = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		int star = max;
		for (int i = 0; i < max; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] >= star) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			star--;
			System.out.println();
		}
		scn.close();
	}
}
