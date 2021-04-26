//  Print the pattern shown below
//	*	*	*	*	*	
//		*	*	*	*	
//			*	*	*	
//				*	*	
//					*
package patterns;

import java.util.Scanner;

public class InvertedMirrorTriangle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int space = 0;
		int star = n;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			for(int k = 1; k <= star; k++) {
				System.out.print("*\t");
			}
			space++;
			star--;
			System.out.println();
		}
	}
}
