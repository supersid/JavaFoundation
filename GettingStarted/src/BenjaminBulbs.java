/*
 * You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on after n fluctuations.
 * Take as input a number n, representing the number of bulbs.
 * Print all the bulbs that will be on after the nth fluctuation in voltage.
 */
import java.util.Scanner;

public class BenjaminBulbs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		// The bulbs numbered as perfect square will be on
		// This is because perfect squares have odd number of factors (2n + 1)
		for(int i = 1; i * i < n; i++) {
			System.out.println(i * i);  // Print perfect square till N
		}
	}
}
