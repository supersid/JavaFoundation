// Example
// Input str = abc
// Output -> [, c, b, bc, a, ac, ab, abc]
package recursionInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		scn.close();
		ArrayList<String> res = gss(str);
		System.out.println(res);
	}

	public static ArrayList<String> gss(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseCase = new ArrayList<String>();
			baseCase.add(""); // when there is no value just add blank
			return baseCase;
		}
		char ch = str.charAt(0); // a
		String remString = str.substring(1); // bc
		ArrayList<String> rss = gss(remString);
		ArrayList<String> myss = new ArrayList<String>();

		for (String string : rss) {
			myss.add("" + string); // [---, --c, -b-, -bc]
		}
		for (String string : rss) {
			myss.add(ch + string); // [---, --c, b--, -bc, a--, a-c, ab-, abc]
		}
		return myss;
	}
}
