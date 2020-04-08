package Episode4p2.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Order {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 3; i++) {
			String s = reader.readLine();
			list.add(s);
		}

		int largestString = list.get(0).length();

		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).length() < largestString) {
				System.out.println(i);
				break;
			}
			largestString = list.get(i).length();
		}
	}
}



/*
Введите с клавиатуры 10 слов в список строк.
Определите, является ли список упорядоченным по возрастанию длины строки.
В случае отрицательного ответа необходимо вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
 */