package recursionOnWayUp;

import java.util.Scanner;

public class PrintKeypadCombination {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		scn.close();
		printKPC(str, "");
	}

	static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	public static void printKPC(String str, String ans) {
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		String codeForCh = codes[ch - '0'];
		for(int i = 0; i < codeForCh.length(); i++) {
			char codeAlpha = codeForCh.charAt(i);
			printKPC(ros, ans + codeAlpha);
		}
	}
}
