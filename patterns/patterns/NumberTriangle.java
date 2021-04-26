//  Print the pattern shown below
//	1	
//	2	3	
//	4	5	6	
//	7	8	9	10	
//	11	12	13	14	15
package patterns;

import java.util.Scanner;

public class NumberTriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int c = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c + "\t");
				c++;
			}
			System.out.println();
		}
	}
}
