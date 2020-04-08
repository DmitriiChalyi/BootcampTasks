package hackerRank.ProSolv.easy;
/*
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		long max, min, sum;
		sum = max = min = 0;

		for(int i=1; i<5;i++){
			long temp = arr[i];
			sum += temp;
			if(max>temp){
				if(min > temp) {
					min = temp;
				}
			} else {
				max = temp;
			}
		}

		System.out.print((sum -max) + " " + (sum - min));
	}

}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		miniMaxSum(arr);

		scanner.close();
	}
}
*/
