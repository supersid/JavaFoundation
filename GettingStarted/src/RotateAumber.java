import java.util.Scanner;

public class RotateAumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// Input for this question.
		int n = scn.nextInt(); // 12345
		int k = scn.nextInt(); // 102
		scn.close();
		int temp = n;
		int nod = 0;
		while (temp != 0) {
			temp = temp / 10;
			nod++; // Number of digits (5)
		}
		k = k % nod; // to handle cases when value of k is large (optimization)
		// To handle cases where k is negative
		// (reduced to 2 for 12345 and 102 as input)
		if (k < 0) {
			k = k + nod;
		}
		int div = 1;
		int mult = 1;
		for (int i = 1; i <= nod; i++) {
			if (i <= k) {
				div = div * 10; // 1000
			} else {
				mult = mult * 10; // 100
			}
		}
		int q = n / div; // 123
		int r = n % div; // 45
		int rotatedNumber = r * mult + q; // 45123
		System.out.println(rotatedNumber);
	}

}
