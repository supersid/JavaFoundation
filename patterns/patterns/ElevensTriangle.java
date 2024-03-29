//  Print the pattern shown below
//	1	
//	1		1	
//	1		2		1	
//	1		3		3		1	
//	1		4		6		4		1
/**The trick to solve this question is know about combination
 * the formula used in this question is 
 * >> nCr+1 = nCr*(n-r)/r+1
 */

package patterns;

import java.util.Scanner;

public class ElevensTriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		for (int i = 0; i < n; i++) {
			int icj = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(icj + "\t");
				int icjp1 = ((icj * (i - j)) / (j + 1));
				icj = icjp1;
			}
			System.out.println();
		}
	}
}
