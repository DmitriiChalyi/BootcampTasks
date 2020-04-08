package Episode5p1.task1;

import java.util.HashSet;
import java.util.Set;

public class Collection {
	public static void main(String[] args) {
		Set<String> hash = new HashSet<>();
		hash.add("dron");
		hash.add("galaxy");
		hash.add("jedi");
		hash.add("wars");
		hash.add("star");

		for (String text : hash) {
			System.out.println(text);
		}
	}
}

/*

операции с множествами Set:
1. add() - добавляет элемент в множество
2. remove() - удаляет элемент из множества
3. contains() - определяет, есть ли элемент в множестве
4. size() - возвращает размер множества
5. clear() - удаляет все элементы из коллекции
6. isEmpty() - возвращает true если множество пустое, и false если там есть хотя бы 1 элемент

Нужно создать коллекцию Set (реализация HashSet) с типом элементов String.
Добавить в неё 10 строк:
galaxy
jedi
wars
star
yoda
master
luke
force
sith
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
 */