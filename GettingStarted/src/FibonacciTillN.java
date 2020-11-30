import java.util.Scanner;

public class FibonacciTillN {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int n = scn.nextInt();
			int i = 0;
			int j = 1;

			System.out.println(i);
			System.out.println(j);
			for (int k = 3; k <= n; k++) {
				int c = i + j;
				System.out.println(c);
				i = j;
				j = c;
			}
		}
	}
}
