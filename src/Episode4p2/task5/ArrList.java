package Episode4p2.task5;

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
		int min = list.get(0).length();
		int index = 0;

		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).length() < min) {
				min = list.get(i).length();
				index = i;
			}
		}
		int value = min;
		System.out.println(list.get(index));

		int min2 = list.get(0).length();
		int index2 = 0;

		for(int i = 0; i < list.size(); i++) {
			if((list.get(i).length() == value) && (i != index)) {
				System.out.println(list.get(i));
			}
		}
	}
}

/*
Объявите переменную типа список строк и сразу проинициализируйте ee.
Программа должна считывать 5 строк с клавиатуры и записывать их в список.
Программа должна выводить самую короткую строку на экран.
Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
 */