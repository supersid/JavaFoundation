package recursionInArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintAllIndices {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int x = Integer.parseInt(br.readLine());
		int[] iarr = allIndices(arr, x, 0, 0);

		if (iarr.length == 0) {
			System.out.println();
			return;
		}
		for (int i = 0; i < iarr.length; i++) {
			System.out.println(iarr[i]);
		}
	}

	public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
		// fsf is index used to store the found values
		if (idx == arr.length) {
			return new int[fsf];
		}
		if (x == arr[idx]) {
			int[] iarr = allIndices(arr, x, idx + 1, fsf + 1); // if value is found increase fsf value
			iarr[fsf] = idx;
			return iarr;
		} else {
			int[] iarr = allIndices(arr, x, idx + 1, fsf); // if the value is not found then do not change fsf value
			return iarr;
		}
	}
}
