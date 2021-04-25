// To print fibonacci number till N
import java.util.Scanner;

public class FibonacciTillN {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int n = scn.nextInt();
			int i = 0; // First fibonacci number
			int j = 1; // Second fibonacci number
			System.out.println(i);
			System.out.println(j);
			for (int k = 3; k <= n; k++) {
				int c = i + j; // Sum of previous 2 numbers
				System.out.println(c);
				i = j; // Shift reference from second to first
				j = c; // Shift reference from sum to second
			}
		}
	}
}
