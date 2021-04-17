package recursionInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		ArrayList<String> res = gss(str);
		System.out.println(res);
	}

	public static ArrayList<String> gss(String str) {
		if(str.length() == 0) {
			ArrayList<String> baseCase = new ArrayList<String>();
			baseCase.add("");
			return baseCase;
		}
		char ch = str.charAt(0);
		String remString = str.substring(1);
		ArrayList<String> rss = gss(remString);
		ArrayList<String> myss = new ArrayList<String>();
		
		for (String string : rss) {
			myss.add("" + string);
		}
		for (String string : rss) {
			myss.add(ch + string);
		}
		return myss;
	}
}
