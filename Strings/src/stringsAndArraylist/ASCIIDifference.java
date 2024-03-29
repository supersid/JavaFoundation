/*
 * You are given a string that contains only lowercase and uppercase alphabets. 
 * You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
 * For "abecd", the answer should be "a1b3e-2c1d", as 
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1
 */
package stringsAndArraylist;

import java.util.Scanner;

public class ASCIIDifference {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		scn.close();
		System.out.println(solution(str));
	}

	public static String solution(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);
			int gap = curr - prev;
			sb.append(gap);
			sb.append(curr);
		}
		return sb.toString();
	}
}
