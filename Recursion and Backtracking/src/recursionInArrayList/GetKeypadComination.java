package recursionInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKeypadComination {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		scn.close();
		// This is the list of combination on each key press
		ArrayList<String> keyPads = new ArrayList<String>();
		keyPads.add(".;");
		keyPads.add("abc");
		keyPads.add("def");
		keyPads.add("ghi");
		keyPads.add("jkl");
		keyPads.add("mno");
		keyPads.add("pqrs");
		keyPads.add("tu");
		keyPads.add("vwx");
		keyPads.add("yz");
		// System.out.println(getKPC(s, keyPads));
		ArrayList<String> result = getKPC(s);
		System.out.print(result);
	}

	/*
	 * Method done by me
	 * 
	 * public static ArrayList<String> getKPC(String str, ArrayList<String> keyPads)
	 * { if (str.length() == 0) { ArrayList<String> baseCase = new
	 * ArrayList<String>(); baseCase.add(""); return baseCase; } char pairChar =
	 * str.charAt(0); String remString = str.substring(1); ArrayList<String>
	 * tempCombination = getKPC(remString, keyPads); ArrayList<String> res = new
	 * ArrayList<String>(); String charCode =
	 * keyPads.get(Integer.parseInt(String.valueOf(pairChar))); for(int i = 0; i <
	 * charCode.length(); i++) { char code = charCode.charAt(i); for(String string:
	 * tempCombination) { res.add(code + string); } } return res; }
	 */

	static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	public static ArrayList<String> getKPC(String str) {
		if (str.length() == 0) {
			ArrayList<String> temp = new ArrayList<>();
			temp.add("");
			return temp;
		}
		char ch = str.charAt(0);
		String rem = str.substring(1);
		ArrayList<String> rres = getKPC(rem);
		ArrayList<String> myres = new ArrayList<>();
		int index = ch - '0';
		for (int i = 0; i < codes[index].length(); i++) {
			char chcode = codes[index].charAt(i);
			for (String val : rres) {
				myres.add(chcode + val);
			}
		}
		return myres;
	}
}
