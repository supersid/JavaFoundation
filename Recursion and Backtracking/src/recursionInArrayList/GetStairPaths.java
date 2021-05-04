/*
 * You are given a number n representing number of stairs in a staircase.
 * You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
 * Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
 */
// Example
// Input -> n = 3
// Output -> [111, 12, 21, 3]
package recursionInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		System.out.println(getStairPaths(n));
	}

	public static ArrayList<String> getStairPaths(int n) {
		if (n < 0) { // if you go to basement then there are not options
			ArrayList<String> baseCase = new ArrayList<String>();
			return baseCase;
		}
		if (n == 0) { // if you are at the ground floor then there is only one option and that is "don't move, you are already there."
			ArrayList<String> baseCase = new ArrayList<String>();
			baseCase.add("");
			return baseCase;
		}
		ArrayList<String> nmone = getStairPaths(n - 1); // options from 1 step
		ArrayList<String> nmtwo = getStairPaths(n - 2); // options from 2 steps
		ArrayList<String> nmthree = getStairPaths(n - 3); // options from 3 steps
		ArrayList<String> res = new ArrayList<String>();

		for (String string : nmone) {
			res.add(1 + string); // just add '1' in front of all the paths
		}
		for (String string : nmtwo) {
			res.add(2 + string); // just add '2' in front of all the paths
		}
		for (String string : nmthree) {
			res.add(3 + string); // just add '3' in front of all the paths
		}
		return res;
	}
}
