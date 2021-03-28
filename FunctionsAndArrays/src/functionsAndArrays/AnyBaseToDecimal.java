package functionsAndArrays;

import java.util.Scanner;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		scn.close();
		int d = getValueIndecimal(n, b);
		System.out.println(d);
	}

	public static int getValueIndecimal(int n, int b) {
		int rv = 0;
		int place = 0;
		while (n != 0) {
			int rem = n % 10;
			rv = rv + rem * (int) (Math.pow(b, place));
			place++;
			n = n / 10;
		}
		return rv;
	}

}
