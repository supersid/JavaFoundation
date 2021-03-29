package functionsAndArrays;

import java.util.Scanner;

public class FindElementInArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();			
		}
		int d = scn.nextInt();
		System.out.println(findIndex(arr, d));
		scn.close();
	}
	
	public static int findIndex(int [] arr, int d) {
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == d) {
				index = i;
				break;
			}
		}
		return index;
	}
}
