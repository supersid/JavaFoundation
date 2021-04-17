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
		if (n < 0) {
			ArrayList<String> baseCase = new ArrayList<String>();
			return baseCase;
		}
		if (n == 0) {
			ArrayList<String> baseCase = new ArrayList<String>();
			baseCase.add("");
			return baseCase;
		}
		ArrayList<String> nmone = getStairPaths(n - 1);
		ArrayList<String> nmtwo = getStairPaths(n - 2);
		ArrayList<String> nmthree = getStairPaths(n - 3);
		ArrayList<String> res = new ArrayList<String>();

		for (String string : nmone) {
			res.add(1 + string);
		}
		for (String string : nmtwo) {
			res.add(2 + string);
		}
		for (String string : nmthree) {
			res.add(3 + string);
		}
		return res;
	}
}
