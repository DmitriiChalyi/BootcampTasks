package Episode8p1.task6;
/*
public class Solution {
	public static void main(String[] args) {
		getDeliciousDrink().taste();
		System.out.println(getWine().getHolidayName());
		System.out.println(getBubblyWine().getHolidayName());
		System.out.println(getWine().getHolidayName());
	}
	public static Drink getDeliciousDrink() {
		return new Wine();
	}
	public static Wine getWine() {
		return new Wine();
	}
	public static Wine getBubblyWine() {
		return new BubblyWine();
	}
}


Нужно создать абстрактный класс Drink с реализованным методом public void taste(), который выводит в консоль "delicious".
Создать класс Wine, который наследуется от Drink, с реализованным методом public String getHolidayName(), который возвращает строку "Birthday".
Создать класс BubblyWine, который наследуется от Wine, с реализованным методом public String getHolidayName(), который возвращает строку "New Year".
Написать реализацию методов getDeliciousDrink, getWine, getBubblyWine.
Все классы должны находиться в отдельных файлах.
 */