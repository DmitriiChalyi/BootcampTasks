package Episode4p2.task6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrList {
	public static void main(String[] args) throws Exception {
		ArrayList<String> list = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 5; i++) {
			String s = reader.readLine();
			list.add(s);
		}
		for (int i = 0; i < 13; i++)
			list.add(0, list.remove(4)); // перенос последнего элемента на 0 позицию

		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i));
	}
}













/*
Создайте список строк.
Добавьте в него 5 строк с клавиатуры.
Выполните 13 раз: удалить последнюю строку и вставить её в начало.
Используя цикл выведите содержимое результирующего списка на экран, каждое значение с новой строки.
 */
