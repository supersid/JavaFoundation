package functionsAndArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseAnArray {
	public static void display(int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int val : a) {
			sb.append(val + " ");
		}
		System.out.println(sb);
	}

	// reverse elements of array within same array
	public static void reverse(int[] a) {
		int start = 0;
		int end = a.length - 1;
		while(start <= end) { // till you cross midpoints
			// replace values of both pointers
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		reverse(a);
		display(a);
	}
}
