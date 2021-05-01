// Example
// Input - n = 4 elements =  3, 12, 13, 15
// Output
// [12, 15]
package stringsAndArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			al.add(scn.nextInt());
		}
		scn.close();
		solution(al);
		System.out.println(al);
	}

	public static void solution(ArrayList<Integer> al) {
		for (int i = al.size() - 1; i >= 0; i--) {
			if (isPrime(al.get(i))) {
				al.remove(i);
			}
		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) { // if the entered number gets divide that means it is not a prime number
				return false;
			}
		}
		return true;
	}
}
