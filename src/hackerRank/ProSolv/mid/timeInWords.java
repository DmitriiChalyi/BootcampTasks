package hackerRank.ProSolv.mid;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class timeInWords {

	static String timeInWords(int h, int m) {
		String oClock = "o' clock";
		String sentence = "";
		String[] hourNumbersStringsArray = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
		String[] minuteNumbersStringsArray = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
				"fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "half"};

		String hourlyString = "";
		String minuteString = "";

		if(m <= 30){
			hourlyString = hourNumbersStringsArray[h-1];
			if(m == 0){
				sentence = hourlyString + " " + oClock;
			}
			else{
				minuteString = minuteNumbersStringsArray[m-1];
				if(m == 1){
					sentence = minuteString + " minute past " + hourlyString;
				}
				else if(m < 30 && m != 15){
					sentence = minuteString + " minutes past " + hourlyString;
				}
				else if(m == 30 || m == 15){
					sentence = minuteString + " past " + hourlyString;
				}
			}
		}
		else{
			m = 60 - m;
			hourlyString = hourNumbersStringsArray[h];
			minuteString = minuteNumbersStringsArray[m-1];
			if(m == 1){
				sentence = minuteString + " minute to " + hourlyString;
			}
			else if(m < 30 && m != 15){
				sentence = minuteString + " minutes to " + hourlyString;
			}
			else if(m == 15){
				sentence = minuteString + " to " + hourlyString;
			}
		}
		return sentence;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int h = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int m = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String result = timeInWords(h, m);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}

