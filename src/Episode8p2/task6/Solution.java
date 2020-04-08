package Episode8p2.task6;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static Map<Double, String> labels = new HashMap<Double, String>();
	static{
		labels.put(1.4, "Intro to Map");
		labels.put(1.24, "Intro Map");
		labels.put(1.43, "Inap");
		labels.put(1.45, "to Map");
		labels.put(1.47, "Intro");

	}
	public static void main(String[] args) {
		System.out.println(labels);
	}


}
/*
В классе Solution должен быть только один метод (main).
В классе Solution должно быть объявлено статическое поле labels типа Map.
Поле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
Метод main должен выводить содержимое labels на экран.
 */