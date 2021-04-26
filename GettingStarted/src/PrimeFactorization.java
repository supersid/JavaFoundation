import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		// Prime factors for 56 is 2, 2, 2, 7
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.close();
		for(int i = 2; i * i < num; i++) {
			while(num % i == 0) {
				num = num / i; // num will be 28 when (i = 2 and num = 56) initially
				System.out.print(i + " ");
			}
		}
		if(num != 1) { // This is for that case when one of the factor is number itself
			System.out.println(num);
		}
	}
}
