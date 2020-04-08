package Episode8p2.task1;

public class Solution {
	public static class MagmaGuard extends Droid{
		protected String getName() {
			return "I am a Magma Guard, " + super.getName();
		}
	}
	public static class GalacticMarine extends Clone{
		protected String getName() {
			return "I am a GalacticMarine, " + super.getName();
		}
	}
	public static void main(String[] args) {
	}
	public static class Droid  {
		protected String getName() {
			return "I am a droid";
		}
	}
	public static class Clone {
			String getName() {
			return "I am a clone soldier";
		}
	}
}

/*
Унаследуйте классы Магма Страж и Глактических пехотинцев от дроидов и клонов, переопределите и вызовите родительский метод getType.

Нужно создать public static класс MagnaGuard(МагмаСтраж).
Создать public static класс GalaticMarine(Галактические Пехотинцы).
Унаследовать класс MagmaGuard от Clone или Droid, подумать, какой логически больше подходит.
Унаследовать класс GalaticMarine от Clone или Droid, подумать, какой логически больше подходит.
В классах MagmaGuard и GalaticMarine переопределить метод String getName(), расширить видимость до максимальной.
В классе MagmaGuard метод getName должен возвращать строку "I am a Magma Guard, " + [getName родительского класса].
В классе GalaticMarine метод getName должен возвращать строку "I am a Galactic Marine, " + [getName родительского класса].
 */