package Episode5p1.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Starwars {
	public static Object createArrayList() {
		List<Object> list = new ArrayList<Object>();
		return list;
	}
	public static Object createLinkedList() {
		List<Object> list = new LinkedList<Object>();
		return list;
	}
	public static void main(String[] args) {
	}
}

/*
Нужно создать два списка - LinkedList и ArrayList.

Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Программа должна содержать только три метода.
Метод createArrayList() должен создавать и возвращать список ArrayList.
Метод createLinkedList() должен создавать и возвращать список LinkedList.
 */