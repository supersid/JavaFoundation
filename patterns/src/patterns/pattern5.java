package patterns;

import java.util.Scanner;

public class pattern5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		
		int space = n/2;
		int star = 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			for(int j = 1; j <= star; j++) {
				System.out.print("*\t");
			}
			for(int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			if(i <= n/2) {
				star += 2;
				space--;
			} else {
				star -= 2;
				space++;
			}			
			System.out.println();
		}
	}
}
