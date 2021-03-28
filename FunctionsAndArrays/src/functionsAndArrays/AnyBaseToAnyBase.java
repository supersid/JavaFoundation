package functionsAndArrays;

import java.util.Scanner;

public class AnyBaseToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sourceBase = scn.nextInt();
		int destBase = scn.nextInt();
		scn.close();
		int result = decimalToAnyBase(n, sourceBase, destBase);
		System.out.println(result);
	}

	public static int anyBaseToDecimal(int n, int sourceBase) {
		int power = 0;
		int decimalValue = 0;

		while (n != 0) {
			int rem = n % 10;
			n = n / 10;
			decimalValue = decimalValue + rem * (int) Math.pow(sourceBase, power);
			power++;
		}
		return decimalValue;
	}

	public static int decimalToAnyBase(int n, int sourceBase, int destBase) {
		n = anyBaseToDecimal(n, sourceBase);
		int power = 0;
		int finalValue = 0;

		while (n != 0) {
			int rem = n % destBase;
			n = n / destBase;
			finalValue = finalValue + rem * (int) Math.pow(10, power);
			power++;
		}
		return finalValue;
	}
}
