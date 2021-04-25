import java.util.Scanner;

public class AllPrimesTillN {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int low = scn.nextInt(); // Starting point or lower limit to check for prime number
			int high = scn.nextInt(); // End point or upper limit to check for prime number

			for (int i = low; i <= high; i++) {
				int count = 0;
				for (int j = 2; j * j <= i; j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				}
				if (count == 0) // In this question only prime number
					System.out.println(i);
			}
		}
	}
}
