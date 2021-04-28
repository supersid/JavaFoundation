/*
 * You are given a number n, representing the size of array arr.
 * You are given n distinct numbers, representing elements of array arr.
 * You are given another number d.
 * You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.
 */
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
				index = i; // check for entered number and then break the loop.
				break;
			}
		}
		return index;
	}
}
