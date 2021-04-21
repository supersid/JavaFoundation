package recursionOnWayUp;

import java.util.Scanner;

public class PrintEncodings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		scn.close();
		printEncodings(str, "");

	}

	// asf - answer so far
	public static void printEncodings(String str, String asf) {
		if (str.length() == 0) {
			System.out.println(asf);
			return;
		}
		/*
		 * If the entered string is of length 1 and if the character is '0' then it will not
		 * be considered as valid
		 */
		if (str.length() == 1) {
			char ch = str.charAt(0);
			if (ch == '0') {
				return;
			} else {
				int chv = ch - '0'; // to convert string number to real number
				char realCharValue = (char) ('a' + chv - 1); // to convert number to character (eg 1-a, 2-b, 3-c etc)
				System.out.println(asf + realCharValue);
			}
		} else { // when entered string length is more than q
			char ch = str.charAt(0); // split 1
			String ros = str.substring(1); // rest of the string
			if (ch == '0') {
				return;
			} else {
				int chv = ch - '0';
				char realCharValue = (char) ('a' + chv - 1);
				printEncodings(ros, asf + realCharValue);
			}
			String ch12 = str.substring(0, 2); // split first 2
			String a12 = str.substring(2); // split remaining

			int code12 = Integer.parseInt(ch12);
			if (code12 <= 26) {
				char realCharValue = (char) ('a' + code12 - 1);
				printEncodings(a12, asf + realCharValue);
			}
		}
	}
}
