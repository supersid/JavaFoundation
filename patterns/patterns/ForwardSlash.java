//  Print the pattern shown below
//					*	
//	
//				*	
//		
//			*	
//			
//		*	
//				
//	*
package patterns;

import java.util.Scanner;

public class ForwardSlash {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j == n + 1) {
					System.out.println("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
