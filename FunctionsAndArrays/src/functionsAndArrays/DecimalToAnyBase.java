package functionsAndArrays;

import java.util.Scanner;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int dn = getValueInBase(n, b);
		System.out.println(dn);
	}

	public static int getValueInBase(int n, int b) {
		int rv = 0;
		int place = 0;
		while (n != 0) {
			int rem = n % b;
			rv = rv + rem * (int)(Math.pow(10, place));
			place++;
			n = n / b;
		}
		return rv;
	}
}
