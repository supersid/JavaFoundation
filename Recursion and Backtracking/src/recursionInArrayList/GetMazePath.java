package recursionInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		scn.close();
		System.out.println(getMazePaths(0, 0, n - 1, m - 1));
	}

	// sr - source row
	// sc - source column
	// dr - destination row
	// dc - destination column
	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
		if (sc > dc || sr > dr) {
			ArrayList<String> baseCase = new ArrayList<String>();
			return baseCase;
		}
		if (sr == dr && sc == dc) {
			ArrayList<String> baseCase = new ArrayList<String>();
			baseCase.add("");
			return baseCase;
		}
		ArrayList<String> horizontal = getMazePaths(sr, sc + 1, dr, dc);
		ArrayList<String> vertical = getMazePaths(sr + 1, sc, dr, dc);
		ArrayList<String> mazePath = new ArrayList<String>();
		for (String string : horizontal) {
			mazePath.add("h" + string);
		}
		for (String string : vertical) {
			mazePath.add("v" + string);
		}
		return mazePath;
	}
}
