package patterns;

import java.util.Scanner;

public class pattern16 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();

		int star = 1;
		int space = 2 * n - 3;
		for (int i = 1; i <= n; i++) {
			int printVal = 1;
			for (int j = 1; j <= star; j++) {
				System.out.print(printVal + "\t");
				printVal++;
			}
			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			if(i == n) {
				star--;
				printVal--;
			}
			for (int j = 1; j <= star; j++) {
				printVal--;
				System.out.print(printVal + "\t");
			}
			star++;
			space -= 2;
			System.out.println();
		}
	}
}
