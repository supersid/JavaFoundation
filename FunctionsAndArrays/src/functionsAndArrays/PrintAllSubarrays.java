package functionsAndArrays;

import java.util.Scanner;

public class PrintAllSubarrays {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
		}
		scn.close();
		for (int i = 0; i < a.length; i++) { // This is starting point of the group subarray
			for (int j = i; j < a.length; j++) { // range from starting point to end of array
				for (int k = i; k <= j; k++) { // to print subarray
					System.out.print(a[k] + "\t");
				}
				System.out.println();
			}			
		}
	}
}
// Logic for this code
/*
 * For example if we take 10, 20, 30
 * the pointer i will pick the main group i.e whether to start from 10, 20 or 30
 * the pointer j will start from i to end of array
 * the pointer k will work under j to print those values
*/
