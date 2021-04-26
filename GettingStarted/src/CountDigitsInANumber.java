import java.util.Scanner;

public class CountDigitsInANumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		scn.close();
		int count = 0;
		while (n != 0) { // Divide number by 10 to take number digit by digit (example - 50/10 = 5)
			n = n / 10;
			count++; // number of digits is referenced in this variable
		}
		System.out.println(count);
	}
}
