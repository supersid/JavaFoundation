package recursionOnWayUp;

import java.util.Scanner;

public class PrintStairPaths {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		printStairPaths(n, "");
	}

	public static void printStairPaths(int n, String path) {
		if (n == 0) {
			System.out.println(path);
		}
		if (n < 0) { // you cannot go anywhere from basement
			return;
		}
		printStairPaths(n - 1, path + "1"); // for 1 step
		printStairPaths(n - 2, path + "2"); // for 2 step
		printStairPaths(n - 3, path + "3"); // for 3 step
	}
}
