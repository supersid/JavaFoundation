//  Print the pattern shown below
//	*				*	
//	*				*	
//	*		*		*	
//	*	*		*	*	
//	*				*
// Code to print 'W' using *

package patterns;

import java.util.Scanner;

public class W {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || (i > n / 2 && (i == j || i + j == n + 1))) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
