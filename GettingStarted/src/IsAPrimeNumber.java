import java.util.Scanner;

public class IsAPrimeNumber {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int t = scn.nextInt();
			for (int i = 1; i <= t; i++) {
				int count = 0;
				int n = scn.nextInt();
				for (int j = 2; j * j <= n; j++) {
					if (n % j == 0) {
						count++;
						break;
					}
				}
				if (count == 0) {
					System.out.println("prime");
				} else {
					System.out.println("not prime");
				}
			}
		}
	}

}
