package hackerRank.Java.easy;
import java.io.*;
import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		boolean b = true;
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		for (int i = 0; i < A.length() / 2 + 1; i++) {
			// отнимаем 1, т.к. i с нуля начинается
			if (A.toCharArray()[i] != A.toCharArray()[A.length() - i - 1]) {
				b = !b;
				break;
			}
		}
		System.out.println(b ? "Yes": "No");
	}
}

