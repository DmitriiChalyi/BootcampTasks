package Episode7p2.task4;

public class Solution {
	public static void main(String[] args) throws Exception {
		ShirivukTranslator shirivukTranslator = new ShirivukTranslator();
		System.out.println(shirivukTranslator.translate());
	}
	public static abstract class Translator {
		public abstract String getLanguage();
		public String translate() {
			return "I am " + getLanguage() + " translator";
		}
	}
	public static class ShirivukTranslator extends Translator {

		public String getLanguage() {
			return ("shirivuk");
		}
	}
}

/*
Нужно создать класс ShirivukTranslator, который наследуется от Translator.
Реализовать все абстрактные методы.
Подумай, что должен возвращать метод getLanguage.
Программа должна выводить на экран “I am shirivuk translator”
путем вызова метода translate у объекта типа ShirivukTranslator.
 */