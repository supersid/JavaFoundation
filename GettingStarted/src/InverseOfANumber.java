import java.util.Scanner;

public class InverseOfANumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int count = 0;
		int inverse = 0;
		while (n != 0) {
			int q = n % 10;
			count++;
			int place = (int) Math.pow(10, q - 1);
			int res = count * place;
			inverse = inverse + res;
			n = n / 10;
		}
		System.out.print(inverse);
	}

}
