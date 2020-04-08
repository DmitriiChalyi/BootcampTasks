package Episode8p1.task8;
/*
public class Solution {
	public static void main(String[] args) {
		StarFighter starFighter = Shop.getStarFighter("TheStartSaber");
		starFighter.getSalesPerMonth();
	}
	static class Shop {
		static StarFighter getStarFighter(String classOfStringFighter) {
			StarFighter starFighter = null;

			if (classOfStringFighter.equals("TheStartSaber")) {
				return new TheStartSaberStarFighter();
			} else if (classOfStringFighter.equals("Chela")) {
				return new ChelaStarFighter();
			} else if (classOfStringFighter.equals("Aurek")) {
				return new AurekStarFighter();
			} else {
				return starFighter;
			}
		}
	}
	abstract class Starfighter {
		abstract int getSalesPerMonth();

		public String getDescription() {
			return "Starfighter";
		}
	}
	public class TheStartSaberStarFighter extends Starfighter {
		int getSalesPerMonth() {
			return 42;
		}
		public String getDescription() {
			return (getDescription()+" sales "+getSalesPerMonth());
		}
	}
	public static class ChelaStarFighter extends Starfighter {
		int getSalesPerMonth() {
			return 33;
		}
		public String getDescription() {
			return (getDescription()+" sales "+getSalesPerMonth());
		}
	}
	public class AurekStarFighter extends Starfighter {
		int getSalesPerMonth() {
			return 230;
		}
		public String getDescription() {
			return (getDescription()+" sales "+getSalesPerMonth());
		}
	}
}

Нужно написать Магазин(Shop) по производству продаже звёздных истребителей(StarFighter):
1. Создать класс StarFighter.
Сделать его абстрактным.
Добавить в класс абстрактный метод int getSalesPerMonth().
Добавить в класс метод String getDescription(), который возвращает строку "StarFighter”.
2. Создать класс TheStartSaberStarFighter, который наследуется от StarFighter.
3. Создать класс ChelaStarFighter, который наследуется от StarFighter.
4. Создать класс AurekStarFighter, который наследуется от StarFighter.
5. Создать класс TalonStarFighter, который наследуется от StarFighter.
6. В каждом из четырех последних классов написать свою реализацию метода getSalesPerMonth. Методы должны возвращать количество продаж в месяц от данного типа истребителя.
7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
Методы должны возвращать строку вида:
<getDescription() родительского класса> + <"Type - Sssss. N purchases per month.">
где Sssss - тип корабля
где N - количество покупок в месяц
8. В классе Shop реализовать метод getStarFighter, который возвращает соответствующий классу тип истребителя.
9. Все созданные вами классы должны быть в отдельных файлах.

 */