package Episode5p1.task3;

import java.util.HashMap;
import java.util.Map;
public class Starwars {
	public static void main(String[] args) throws Exception {
		String[] heroes = new String[]{"leia", "luke", "obi-wan", "solo", "anakin", "sidius", "yoda", "chewbacca", "windu", "vader"};
		Map<String, Hero> map = addHeroesToMap(heroes);
		for (Map.Entry<String, Hero> pair : map.entrySet()) {
			System.out.println(pair.getKey() + " - " + pair.getValue());
		}
	}
	public static Map<String, Hero> addHeroesToMap(String[] heroes) {
		Map<String, Hero> map = new HashMap<String, Hero>();
		for (int i = 0; i < heroes.length; i++){
			map.put(heroes[i], new Hero(heroes[i]));
		}
		return map;
	}

	public static class Hero {
		String name;
		public Hero(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return name != null ? name.toUpperCase() : null;
		}
	}
}
/*
	Программа не должна считывать значения с клавиатуры.
		В методе addHeroesToMap() объявите переменную коллекции Map с типом элементов String, Heroes и сразу проинициализируйте ee.
		Метод addHeroesToMap() должен добавлять в коллекцию всех героев из массива String[] heroes, согласно условию.
		Программа должна выводить содержимое коллекции на экран, каждую пару через дефис и с новой строки.
		*/