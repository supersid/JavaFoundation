package recursion;

import java.util.Scanner;

public class PowerLogarithmic {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		int xn = power(x, n);
		System.out.println(xn);
		scn.close();
	}

	public static int power(int x, int n) {
		if(n == 0) {
			return 1;
		}
		int xnbt = power(x, n/2);
		int xn = xnbt * xnbt;
		
		if(n % 2 == 1) {
			xn = xn * x;
		}
		return xn;
	}
}
