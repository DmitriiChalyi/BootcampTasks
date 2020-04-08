package Episode5p1.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Starwars {
	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<>();
		hm.put("leia","organa");
		hm.put("Anakin","Skywalker");
		hm.put("Luke","Skywalker");

		for (Map.Entry entry : hm.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: "
					+ entry.getValue());
		}
	}
}

/*
Нужно создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
leia - organa,
luke - skywalker,
general - hux,
captain - phasma,
darth - veider,
obi-wan - kenobi,
anakin - skywalker,
jar-jar - binks,
count - dooku,
master - yoda.
 */