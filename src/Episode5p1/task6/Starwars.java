package Episode5p1.task6;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
public class Starwars {
	public static void main(String[] args) {
		System.out.println(getInsertTime(new ArrayList()));
		System.out.println(getInsertTime(new LinkedList()));
	}
	public static long getInsertTime(List list) {
		Date currentTime = new Date();
		insert10000(list);
		Date newTime = new Date();
		long msDelay = newTime.getTime() - currentTime.getTime();
		return msDelay;
	}
	public static void insert10000(List list) {
		for (int i = 0; i < 10000; i++) {
			list.add(0, new Object());
		}
	}
}
/*
	Date currentTime = new Date(); //получаем текущую дату и время
    Thread.sleep(3000); //ждём 3 секунды – 3000 миллисекунд
			Date newTime = new Date(); //получаем новое текущее время
			long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
			System.out.println("Time distance is: " + msDelay + " in ms");


Программа должна выводить числа на экран.
Метод main должен вызывать метод getInsertTime только два раза.
Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
Метод getInsertTime должен вызывать метод insert10000 только один раз.
Метод getInsertTime должен вернуть время в миллисекундах, которое занимает 10 тысяч вставок в список.
 */