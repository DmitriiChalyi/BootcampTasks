package Episode5p2.task14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {
		readData();
	}
	public static void readData() {
		ArrayList<Integer> list = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				int s = Integer.parseInt(reader.readLine());
				list.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}
}




/*
Код по чтению чисел с клавиатуры должен быть в методе readData.
Код внутри readData обернуть в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа,
, то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
 */