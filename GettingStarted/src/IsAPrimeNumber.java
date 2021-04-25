import java.util.Scanner;

public class IsAPrimeNumber {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int t = scn.nextInt(); // input for total number of values to be checked
			for (int i = 1; i <= t; i++) {
				int count = 0;
				int n = scn.nextInt(); // take input to check for prime or not prime
				// The loops starts from 2 as 1 divides all the natural numbers.
				// The loop will only run till values for sqrt(n) as the factor value will not
				// be greater than the square root value
				for (int j = 2; j * j <= n; j++) {
					if (n % j == 0) {
						count++;
						break; // The loop will break if the entered value gets divided.
					}
				}
				if (count == 0) { // If the number is not divided then it is a prime number
					System.out.println("prime");
				} else {
					System.out.println("not prime");
				}
			}
		}
	}

}
