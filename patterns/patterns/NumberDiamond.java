//  Print the pattern shown below
//			1	
//		2	3	2	
//	3	4	5	4	3	
//		2	3	2	
//			1	
package patterns;

import java.util.Scanner;

public class NumberDiamond {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		scn.close();
		int space = n / 2;
		int star = 1;
		int printVal = 1;

		for (int i = 1; i <= n; i++) {
			if (i <= n / 2 + 1) {
				printVal = i;
			}

			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print(printVal + "\t");
				if (k <= star / 2) {
					printVal++;
				} else {
					printVal--;
				}
			}
			if (i <= n / 2) {
				space--;
				star += 2;
			} else {
				space++;
				star -= 2;
			}
			System.out.println();
		}
	}
}
