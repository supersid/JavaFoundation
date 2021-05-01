/*
 * You are given a string that contains only lowercase and uppercase alphabets. 
 * You have to toggle the case of every character of the given string.
 */
package stringsAndArraylist;

import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
		scn.close();
	}

	public static String toggleCase(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// for example alphabet p
			// 'p' - 'a' = 'P' - 'A'
			// We have to manipulate the equation to convert to upppercase or lowercase
			if (ch >= 'a' && ch <= 'z') {
				char uc = (char)(ch - 'a' + 'A');
				sb.append(uc);
			} else {
				char lc = (char)(ch - 'A' + 'a');
				sb.append(lc);
			}
		}
		return sb.toString();
	}
}
