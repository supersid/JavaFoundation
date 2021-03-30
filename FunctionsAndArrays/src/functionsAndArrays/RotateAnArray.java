/*
 * To rotate an array just 
 * reverse the part after break point,
 * before break point and 
 * then reverse the whole array.
 */
package functionsAndArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RotateAnArray {
	public static void display(int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int val : a) {
			sb.append(val + " ");
		}
		System.out.println(sb);
	}
	
	// Tried with this method. 4/6 test cases passed.
/*
	public static void rotate(int[] a, int k) {
		if (k > a.length) {
			k = k % a.length;
		}
		if(k < 0) {
			k = a.length - k;
		}
		int nmk = a.length - k;
		int idx = 0;
		int[] tempArray = new int[a.length];
		for (int i = nmk; i < a.length; i++) {
			tempArray[idx] = a[i];
			idx++;
		}
		int idxO = 0;
		for (int i = idx; i < tempArray.length; i++) {
			tempArray[i] = a[idxO];
			idxO++;
		}
		for (int i = 0; i < tempArray.length; i++) {
			a[i] = tempArray[i];
		}
	}
*/

	public static void rotate(int[] a, int k) {
		k = k % a.length; // optimization in case k is very large
		if (k < 0) {
			k = a.length + k; // In case k is negative
		}
		a = reverse(a, a.length - k, a.length - 1);
		a = reverse(a, 0, a.length - k - 1);
		a = reverse(a, 0, a.length - 1);
	}

	public static int[] reverse(int[] a, int start, int end) {
		while (start <= end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		return a;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		int k = Integer.parseInt(br.readLine());

		rotate(a, k);
		display(a);
	}

}
