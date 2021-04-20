package recursionOnWayUp;

import java.util.Scanner;

public class PrintMazePaths {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		scn.close();
		printMazePaths(0, 0, n - 1, m - 1, "");
	}

	// psf - path so far
	// sr - source row
	// sc - source column
	// dr - destination row
	// dc - destination column
	public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
		if (sr == dr && sc == dc) {
			System.out.println(psf);
			return;
		}
		if (sr > dr || sc > dc) {
			return;
		}
		if (sc < dc) {
			printMazePaths(sr, sc + 1, dr, dc, psf + "h");
		}
		if (sr < dr) {
			printMazePaths(sr + 1, sc, dr, dc, psf + "v");
		}
	}
}
