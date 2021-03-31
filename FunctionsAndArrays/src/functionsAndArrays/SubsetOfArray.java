/*
 * The trick to this question is think output in terms of binary
 * Number of subsets is 2^n
 * Print blanks when there is 0 and value when value is 1
 */
package functionsAndArrays;

import java.util.Scanner;

public class SubsetOfArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scn.nextInt();
		}
		scn.close();
		int nofs = (int) Math.pow(2, n); // To calculate the number of subsets
		
		for (int i = 0; i < nofs; i++) {
			String set = "";
			int temp = i;
			for(int j = a.length - 1; j >= 0; j--) {				
				int d = temp % 2;
				temp = temp/2;
				
				if(d == 0) {
					set = "-\t" + set;
				} else {
					set = a[j] + "\t" + set;
				}
			}
			System.out.println(set);			
		}
	}
}
