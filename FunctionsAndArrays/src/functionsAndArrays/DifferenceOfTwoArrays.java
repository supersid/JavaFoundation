package functionsAndArrays;

import java.util.Scanner;

public class DifferenceOfTwoArrays {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int [] arr1 = new int[n1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scn.nextInt();
		}
		int n2 = scn.nextInt();
		int [] arr2 = new int[n2];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scn.nextInt();
		}
		scn.close();
		
		int [] diff = new int[n2]; // Assuming n2 is more or equal to n1
		
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = diff.length - 1;
		int c = 0;
		int d = 0;
		while(k >= 0) {
			d = 0;
			int arr1V = i >= 0 ? arr1[i] : 0;
			 if(arr2[j] + c >= arr1V) {
				 d = arr2[j] + c - arr1V;
				 c = 0;
			 } else {
				 d = arr2[j] + c + 10 - arr1V;
				 c = -1;
			 }
			 diff[k] = d;
			 k--;
			 j--;
			 i--;
		}
		int idx = 0;
		for (int l = 0; l < diff.length; l++) {
			if(diff[l] == 0) {
				idx++;
			} else {
				break;
			}
		}
		for (int l = idx; l < diff.length; l++) {
			System.out.println(diff[l]);
		}
	}
}
