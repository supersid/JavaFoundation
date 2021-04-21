/*
 * Question video - https://youtu.be/EgoKDqfpbMg?list=TLGGSSR4_tPidcgyMTA0MjAyMQ
 * 1. You are given a number n, the size of a chess board.
 * You are given a row and a column, as a starting point for a knight piece.
 * You are required to generate the all moves of a knight starting in (row, col) such that knight visits all cells of the board exactly once.
 * Complete the body of printKnightsTour function - without changing signature - to calculate and print all configurations of the chess board representing the route of knight through the chess board. Use sample input and output to get more idea.
 * Note -> When moving from (r, c) to the possible 8 options give first precedence to (r - 2, c + 1) and move in clockwise manner to explore other options.
 * Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
 */
package backtracking;

import java.util.Scanner;

public class KnightsTour {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = scn.nextInt();
		int col = scn.nextInt();
		int[][] chess = new int[n][n];
		scn.close();
		printKnightsTour(chess, row, col, 1);
	}

	public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
		if (r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0) {
			return;
		} else if (upcomingMove == chess.length * chess.length) {
			chess[r][c] = upcomingMove;
			displayBoard(chess);
			chess[r][c] = 0;
		}

		chess[r][c] = upcomingMove;
		printKnightsTour(chess, r - 2, c + 1, upcomingMove + 1);
		printKnightsTour(chess, r - 1, c + 2, upcomingMove + 1);
		printKnightsTour(chess, r + 1, c + 2, upcomingMove + 1);
		printKnightsTour(chess, r + 2, c + 1, upcomingMove + 1);
		printKnightsTour(chess, r + 2, c - 1, upcomingMove + 1);
		printKnightsTour(chess, r + 1, c - 2, upcomingMove + 1);
		printKnightsTour(chess, r - 1, c - 2, upcomingMove + 1);
		printKnightsTour(chess, r - 2, c - 1, upcomingMove + 1);
		chess[r][c] = 0;
	}

	public static void displayBoard(int[][] chess) {
		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess[0].length; j++) {
				System.out.print(chess[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
	}
}
