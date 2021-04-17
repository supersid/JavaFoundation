package recursionInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKeypadComination {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		scn.close();
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
		System.out.println(getKPC(s, keyPads));
	}

//    0 -> .;
//    1 -> abc
//    2 -> def
//    3 -> ghi
//    4 -> jkl
//    5 -> mno
//    6 -> pqrs
//    7 -> tu
//    8 -> vwx
//    9 -> yz
	public static ArrayList<String> getKPC(String str, ArrayList<String> keyPads) {
		if (str.length() == 0) {
			ArrayList<String> baseCase = new ArrayList<String>();
			baseCase.add("");
			return baseCase;
		}            
		char pairChar = str.charAt(0);
		String remString = str.substring(1);
		ArrayList<String> tempCombination = getKPC(remString, keyPads);
		ArrayList<String> res = new ArrayList<String>();
		String charCode = keyPads.get(Integer.parseInt(String.valueOf(pairChar)));
		for(int i = 0; i < charCode.length(); i++) {
			char code = charCode.charAt(i);
			for(String string: tempCombination) {
				res.add(code + string);
			}
		}
		return res;
	}
}
