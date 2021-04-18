/*
 * 1. You are given a number n and a number m representing number of rows and columns in a maze.
 * You are standing in the top-left corner and have to reach the bottom-right corner. 
 * In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
 * Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
 */
package recursionInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathWithJumps {

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
		if (sr > dr || sc > dc) {
			ArrayList<String> baseCase = new ArrayList<String>();
			return baseCase;
		}
		if (sr == dr && sc == dc) {
			ArrayList<String> baseCase = new ArrayList<String>();
			baseCase.add("");
			return baseCase;
		}
		ArrayList<String> mazePaths = new ArrayList<String>();
		for (int count = 1; count <= dc - sc; count++) {
			ArrayList<String> horizontal = getMazePaths(sr, sc + count, dr, dc);
			for (String string : horizontal) {
				mazePaths.add("h" + count + string);
			}
		}
		for (int count = 1; count <= dr - sr; count++) {
			ArrayList<String> vertical = getMazePaths(sr + count, sc, dr, dc);
			for (String string : vertical) {
				mazePaths.add("v" + count + string);
			}
		}
		for (int count = 1; count <= dr - sr && count <= dc - sc; count++) {
			ArrayList<String> diagonal = getMazePaths(sr + count, sc + count, dr, dc);
			for (String string : diagonal) {
				mazePaths.add("d" + count + string);
			}
		}
		return mazePaths;
	}
}
