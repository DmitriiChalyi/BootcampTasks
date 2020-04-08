package Episode7p1.task7;

public class Solution {
	public static void main(String[] args) {
	}
	public static abstract class Predator {
		public abstract String getName();
	}
	public static class Rathtar extends Predator{
		public String getName() {
			return null;
		}
	}
}

/*
Класс Predator должен быть абстрактным.
Класс Rathtar не должен быть абстрактным.
Класс Rathtar должен наследоваться от класса Predator.
Класс Rathtar должен реализовать абстрактный метод из класса Predator.
Метод getName() класса Rathtar должен возвращать любое имя раффтара.
 */