/*
 * 1. You are given a number n and a number m representing number of rows and columns in a maze.
 * 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
 */
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
//	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
//		if (sc > dc || sr > dr) {
//			ArrayList<String> baseCase = new ArrayList<String>();
//			return baseCase;
//		}
//		if (sr == dr && sc == dc) {
//			ArrayList<String> baseCase = new ArrayList<String>();
//			baseCase.add("");
//			return baseCase;
//		}
//		ArrayList<String> horizontal = getMazePaths(sr, sc + 1, dr, dc);
//		ArrayList<String> vertical = getMazePaths(sr + 1, sc, dr, dc);
//		ArrayList<String> mazePath = new ArrayList<String>();
//		for (String string : horizontal) {
//			mazePath.add("h" + string);
//		}
//		for (String string : vertical) {
//			mazePath.add("v" + string);
//		}
//		return mazePath;
//	}

	// Method by Sumeet sir
	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
		if ((sr == dr) && (sc == dc)) {
			ArrayList<String> temp = new ArrayList<>();
			temp.add("");
			return temp;
		}
		ArrayList<String> rowPath = new ArrayList<>();
		ArrayList<String> colPath = new ArrayList<>();

		if (sr < dr) {
			rowPath = getMazePaths(sr + 1, sc, dr, dc);
		}
		if (sc < dc) {
			colPath = getMazePaths(sr, sc + 1, dr, dc);
		}

		ArrayList<String> mazePath = new ArrayList<>();

		for (String val : colPath) {
			mazePath.add("h" + val);
		}
		for (String val : rowPath) {
			mazePath.add("v" + val);
		}
		return mazePath;
	}
}
