package Episode4p2.task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Relax {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 5; i++) {
			String s = reader.readLine();
			list.add(s);
		}
		for(int i = 4; i >= 0; i--) {
			System.out.println(list.get(i));
		}
	}
}

/*
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке. Каждый элемент - с новой строки.
 */
