package hackerRank.ProSolv.easy;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import static java.lang.Integer.parseInt;
/*
class taskDiagonalMatrix {

	 * Complete the 'diagonalDifference' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts 2D_INTEGER_ARRAY arr as parameter.


	public static int diagonalDifference(List<List<Integer>> arr) throws IOException {
		int sum1 = 0;
		int sum2 = 0;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = parseInt(bufferedReader.readLine());
		for(int i=0; i<3; i++){
			sum1+= arr.get(i).get(i);
			sum2+= arr.get(i).get(3 - 1 - i);
		}
		return Math.abs(sum1-sum2);
	}
}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

			List<Integer> arrRowItems = new ArrayList<>();

			for (int j = 0; j < n; j++) {
				int arrItem = parseInt(arrRowTempItems[j]);
				arrRowItems.add(arrItem);
			}

			arr.add(arrRowItems);
		}

		int result = Result.diagonalDifference(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
*/