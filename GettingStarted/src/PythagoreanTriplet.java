
/*
 * You are required to check if a given set of numbers is a valid pythagorean triplet.
 * Take as input three numbers a, b and c.
 * Print true if they can form a pythagorean triplet and false otherwise.
 */
import java.util.Scanner;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt(); // 5
		int n2 = scn.nextInt(); // 3
		int n3 = scn.nextInt(); // 4
		scn.close();

		int temp = n1 > n2 ? n1 : n2; // temp = 5
		int max = n3 > temp ? n3 : temp; // max = 5

		if (max == n1) {
			boolean flag = ((n2 * n2 + n3 * n3) == (n1 * n1));
			System.out.println(flag);
		} else if (max == n2) {
			boolean flag = ((n1 * n1 + n3 * n3) == (n2 * n2));
			System.out.println(flag);
		} else {
			boolean flag = ((n2 * n2 + n1 * n1) == (n3 * n3));
			System.out.println(flag);
		}
	}
}
