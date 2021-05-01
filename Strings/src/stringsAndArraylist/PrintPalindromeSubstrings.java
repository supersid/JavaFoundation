package stringsAndArraylist;

import java.util.Scanner;

public class PrintPalindromeSubstrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		scn.close();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				if (isPalindrome(s.substring(i, j))) {
					System.out.println(s.substring(i, j));
				}
			}
		}
	}	

	public static boolean isPalindrome(String s) {
		/*
		 * Start the point from beginning and end
		 * Compare values of both pointers
		 * If value matches shift pointer or return false
		 * The moment they cross each other end the iteration
		 */
		int i = 0;
		int j = s.length() - 1;
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
