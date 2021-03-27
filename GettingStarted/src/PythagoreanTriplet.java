import java.util.Scanner;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int n3 = scn.nextInt();
		scn.close();

		int temp = n1 > n2 ? n1 : n2;
		int max = n3 > temp ? n3 : temp;

		if (max == n1) {
			boolean flag = ((n2 * n2 + n3 * n3) == (n1 * n1));
			System.out.println(flag);
		} else if (max == n2) {
			boolean flag = ((n1 * n1 + n3 * n3) == (n2 * n2));
			System.out.println(flag);
		} else {
			boolean flag = ((n2 * n2 + n1 * n1) == (n3 * n3));
			System.out.println(flag);

		}
	}
}
