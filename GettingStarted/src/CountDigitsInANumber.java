import java.util.Scanner;

public class CountDigitsInANumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		long n = scn.nextLong();
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		System.out.println(count);
	}

}
