/*
 * The example here is for single iteration
 */
import java.util.Scanner;

public class SplitDigits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); // (example - 123456)
		scn.close();
		// Count number of digits
		int temp = n; // temp variable to count number of digits
		int count = 0;
		while (temp != 0) {
			temp = temp / 10;
			count++; // 6 for (123456)
		}
		int div = (int) Math.pow(10, count - 1); // new number of same power value (100000 for 123456)
		while (div != 0) {
			int digit = n / div; // (1 for 123456)
			System.out.println(digit); // (1 will be printed)
			n = n % div; // (23456)
			div = div / 10; // (10000)
		}
	}
}
