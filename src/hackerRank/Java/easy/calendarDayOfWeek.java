package hackerRank.Java.easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Resultss {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING.
	 * The function accepts following parameters:
	 *  1. INTEGER month
	 *  2. INTEGER day
	 *  3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {
		Calendar cl = Calendar.getInstance();

// -1 because for the Calendar Class Month January starts with 00 and not 01
		cl.set(year, (month - 1), day);

		return (cl.getDisplayName(cl.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()).toUpperCase());
	}

}

public class calendarDayOfWeek {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = Resultss.findDay(month, day, year);

		bufferedWriter.write(res);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
