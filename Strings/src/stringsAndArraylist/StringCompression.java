/*
 * You are given a string. 
 * You have to compress the given string in the following two ways - 
 * First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
   For "aaabbccdee", the compressed string will be "abcde".
 * Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
   For "aaabbccdee", the compressed string will be "a3b2c2de2".
 */
package stringsAndArraylist;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		scn.close();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

	public static String compression1(String str) {
		String s = str.substring(0, 1);
		for (int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);
			if (curr != prev) {
				s += curr;
			}
		}
		return s;
	}

	public static String compression2(String str) {
		String s = str.substring(0, 1);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);

			if (curr == prev) {
				count++;
			} else {
				if (count > 1) {
					s += count;
					count = 1;
				}
				s += curr;
			}
		}
		if (count > 1) {
			s += count;
			count = 1;
		}
		return s;
	}
}
