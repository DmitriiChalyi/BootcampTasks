package Episode5p1.task9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Starwars {
	public static Set<Integer> createSet() {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < 20; i++)
			set.add(i);
		return set;
	}

	public static Set<Integer> removeGreaterThan10(Set<Integer> set) {
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext())
		{
			if (iter.next() > 10)
				iter.remove();
		}
		return set;
	}

	public static void main(String[] args) {
		Set<Integer> set = createSet();
		System.out.println(removeGreaterThan10(set));
	}
}

/*


    for (String text : set)
    {
        System.out.println(text);
    }

Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Класс Solution должен содержать только три метода.
Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
Метод removeGreaterThan10() должен удалять из множества все числа больше 10.
 */