package Episode8p1.task9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(reader.readLine());
		int p = Integer.parseInt(reader.readLine());
		System.out.println("Мы считали с клавиатуры эту строку:");
		System.out.println(s);
		System.out.println(p);
		int k = 0;
		for(int i = 1; i < s*p; i++){
			if ((s % i == 0) && (p % i == 0))
				k = i;
		}
		System.out.println(k);
	}
}

/*
	Ваше следующее задание - найти наибольший общий делитель (или НОД) двух целых положительных чисел.

		Наибольший общий делитель (НОД).
		Ввести с клавиатуры 2 целых положительных числа.
		Вывести в консоль наибольший общий делитель

 */