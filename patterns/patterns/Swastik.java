/*
 * This code is written to print swastik.
 * Sample out given below (input >> 5)
 */

//	*	*	*		*	
//			*		*	
//	*	*	*	*	*	
//	*		*			
//	*		*	*	*	
package patterns;

import java.util.Scanner;

public class Swastik {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		if ((n >= 1 && n <= 10) && (n % 2 != 0)) {
			printStar(n);
		}
	}

	public static void printStar(int n) {
		int temp = n / 2 + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((j == temp) || (i == temp) || (i == 1 && j < temp) || (i > temp && j == 1) || (i < temp && j == n)
						|| (j > temp && i == n)) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
