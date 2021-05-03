package recursionInArray;

import java.util.Scanner;

public class LastIndex {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int x = scn.nextInt();
		scn.close();
		System.out.println(lastIndex(arr, n - 1, x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
    	if(idx < 0) {
    		return -1; // if number not found and there are no elements left return -1
    	}
    	if(arr[idx] == x) {
    		return idx; // if number if found return index
    	} else {
    		int num = lastIndex(arr, idx - 1, x);
    		return num;
    	}
    }
}
