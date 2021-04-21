package backtracking;

import java.util.Scanner;

public class NQueens {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] chess = new int[n][n];
		scn.close();
		printNQueens(chess, "", 0);
	}

	public static void printNQueens(int[][] chess, String qsf, int row) {
		if (row == chess.length) {
			System.out.println(qsf + ".");
			return;
		}
		if (row > chess.length || row < 0) {
			return;
		}
		for (int col = 0; col < chess.length; col++) {
			if (isQueenSafe(chess, row, col)) {
				chess[row][col] = 1;
				printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
				chess[row][col] = 0;
			}
		}
	}

	public static boolean isQueenSafe(int[][] chess, int row, int col) {
		// The reason we check previous row only is because the next row is not yet
		// visited. Therefore it is not possible to have a value of 1 in any of those
		// rows.
		for (int i = row - 1, j = col; i >= 0; i--) {
			if (chess[i][j] == 1) {
				return false;
			}
		}
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (chess[i][j] == 1) {
				return false;
			}
		}
		for (int i = row - 1, j = col + 1; i >= 0 && j < chess[0].length; i--, j++) {
			if (chess[i][j] == 1) {
				return false;
			}
		}
		return true;
	}
}
