package Episode5p1.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Starwars {
	public static void main(String[] args) throws IOException {
		List<Integer> arrayList = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 5; i++) {
			int s = Integer.parseInt(reader.readLine());
			arrayList.add(s);
		}
		int j = 0;
		for (int i = 1; i < 5; i++) {
			if (arrayList.get(i).equals(arrayList.get(i-1))){
				j++;
			}
		}
		System.out.println(j);
	}
}

/*
Программа должна выводить число на экран.
Программа должна считывать значения с клавиатуры.
В методе main объявите переменную типа List с типом элементов Integer и сразу проинициализируйте ee.
Программа должна добавлять в коллекцию 10 чисел, согласно условию.
Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
 */