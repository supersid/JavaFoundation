import java.util.Scanner;

public class RotateAumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		// Input for this question.
		int n = scn.nextInt();
		int k = scn.nextInt();

		// Logic
		int temp = n;
		int nod = 0;
		while (temp != 0) {
			temp = temp / 10;
			nod++; // Number of digits
		}

		k = k % nod; // to handle cases when value of k is large (optimization)

		// To handle cases where k is negative
		if (k < 0) {
			k = k + nod;
		}

		int div = 1;
		int mult = 1;
		for (int i = 1; i <= nod; i++) {
			if (i <= k) {
				div = div * 10;
			} else {
				mult = mult * 10;
			}
		}
		int q = n / div;
		int r = n % div;
		int rotatedNumber = r * mult + q;
		System.out.println(rotatedNumber);
	}

}
