package Episode5p1.task4;

import java.util.HashMap;
import java.util.Map;
public class Starwars {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("leia", "leia");
		map.put("veider", "veider");
		map.put("darth", "darth");
		map.put("anakin", "anakin");
		map.put("skywalker", "skywalker");
		map.put("star", "star");
		map.put("wars", "wars");
		map.put("dron", "dron");
		map.put("yoda", "yoda");
		map.put("master", "master");
		printHeroes(map);
	}
	public static void printHeroes(Map<String, String> map) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
/*
Есть коллекция Map<String, String> (реализация HashMap), туда занесли 10 различных строк.
Нужно вывести на экран список значений, каждый элемент с новой строки.
 */