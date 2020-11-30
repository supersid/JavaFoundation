import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		while (n != 0) {
			int div = 10;
			int revDigit = n % div;
			System.out.print(revDigit);
			n = n / 10;
		}
	}

}
