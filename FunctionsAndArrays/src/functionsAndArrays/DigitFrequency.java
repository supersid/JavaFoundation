package functionsAndArrays;

import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
//		frequency of 2 in 1223422 is 4
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); // 1223422
		int d = scn.nextInt(); // 2
		scn.close();
		System.out.println(getDigitFrequency(n, d));
	}

	public static int getDigitFrequency(int n, int d) {
		// example for single iteration
		int count = 0;
		while (n != 0) {
			int temp = n % 10; // last digit of n
			if (temp == d) {
				count++;
			}
			n = n / 10; // 122342 for 1223422
		}
		return count;
	}
}
