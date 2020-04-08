package Episode4p2.task7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ArrList {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("darth");
		strings.add("veider");
		strings.add("skywalker");
		strings.add("jedi");
		strings = Arraylist(strings);

		for (String string : strings) {
			System.out.println(string);
		}
	}
	public static ArrayList<String> Arraylist(ArrayList<String> strings) {
		for (int i = 0; i < strings.size()-1; i++) {
			if (!strings.get(i).contains("d") && strings.get(i).contains("s"))
				strings.add(strings.get(i));
			else if (strings.get(i).contains("d") && !strings.get(i).contains("s"))
				strings.remove(i--);
			}
		return strings;
	}
}

/*
Создайте список слов, заполните его самостоятельно.
Метод Arraylist должен:
удалять из списка строк все слова, содержащие букву "d"
удваивать все слова содержащие букву "s".
если слово содержит и букву "d" и букву "j", то оставить это слово без изменений.
с другими словами ничего не делать.
 */