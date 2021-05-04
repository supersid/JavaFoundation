/*
 * This is a level and option approach
 * No memory space is required to store the data
 * Answer will be printed going upwards in euler graph
 */
package recursionOnWayUp;

import java.util.Scanner;

public class PrintSubsequence {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		scn.close();
		printSS(str, "");
	}

	public static void printSS(String str, String ans) {
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String remString = str.substring(1);
		printSS(remString, ans + ch); // option yes
		printSS(remString, ans + ""); // option no
	}
}
