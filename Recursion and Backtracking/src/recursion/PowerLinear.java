package recursion;

import java.util.Scanner;

public class PowerLinear {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(power(x, n));
		scn.close();
	}

	public static int power(int x, int n) {
		if(n == 0) {
			return 1;
		}
		int xnmo = power(x, n - 1);
		int xn = x * xnmo; 
		return xn;
	}
}
