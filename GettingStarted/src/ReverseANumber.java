/*
 * Example for this code is for single iteration
 */
import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); // (example - 123456)
		scn.close();
		while (n != 0) {
			int div = 10;
			int revDigit = n % div; // (6 for 123456)
			System.out.print(revDigit); // (Print 6)
			n = n / 10; // (123455 for 123456)
		}
	}
}
