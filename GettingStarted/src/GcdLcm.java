/*
 * Example is for single iteration
 */
import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		// GCD and LCM for 36 and 24 is 12 and 72 respectively.
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt(); // 36
		int num2 = scn.nextInt(); // 24
		scn.close();
		int lnum1 = num1; // copy of num1
		int lnum2 = num2; // copy of num2
		// this is solved using division method
		while (num1 % num2 != 0) {
			int rem = num1 % num2; // rem = 12
			num1 = num2; // num1 = 24			
			num2 = rem; // num2 = 12
		}
		System.out.println("GCD is " + num2);
		// Formula for this question is (gcd * lcm = num1 * num2)
		int lcm = (lnum1 * lnum2) / num2;
		System.out.print("LCM is " + lcm);
	}
}
