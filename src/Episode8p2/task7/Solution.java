package Episode8p2.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static int A;
	public static int B;

	static {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			A = Integer.parseInt(reader.readLine());
			B = Integer.parseInt(reader.readLine());
			reader.close();
		} catch (IOException e) {

		}
	}

	public static final int MIN = min(A, B);

	public static void main(String[] args) {
		System.out.println(MIN);
	}

	public static int min(int a, int b) {
		return a < b ? a : b;
	}
}

/*
В статическом блоке считайте две переменные с консоли А и В с типом int.
Не забыть про IOException, который надо обработать в блоке catch.
Закрыть поток ввода методом close().
 */