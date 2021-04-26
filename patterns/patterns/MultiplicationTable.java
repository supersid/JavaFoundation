// Print multiplication table till 10 for number n
package patterns;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}
