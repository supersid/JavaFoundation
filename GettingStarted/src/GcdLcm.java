import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		scn.close();

		int lnum1 = num1;
		int lnum2 = num2;

//		this is solved using division method
		while (num1 % num2 != 0) {
			int rem = num1 % num2;
			num1 = num2;
			num2 = rem;
		}
		System.out.println("GCD is " + num2);

//		Formula for this question is (gcd * lcm = num1 * num2)
		int lcm = (lnum1 * lnum2) / num2;
		System.out.print("LCM is " + lcm);
	}
}
