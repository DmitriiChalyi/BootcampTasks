package Episode8p1.task5;

public class Solution {
	public static void main(String[] args) {
		Object obj = new Kylo();
				Anakin anakin = (Anakin) obj;
		Leia leia = (Leia) anakin;
		Kylo kylo = (Kylo) leia;
		printClasses(obj, anakin, leia, kylo);
	}
	public static void printClasses(Object obj, Anakin anakin, Leia leia, Kylo kylo) {
		System.out.println(kylo.getClass().getSimpleName());
		System.out.println(leia.getClass().getSimpleName());
		System.out.println(anakin.getClass().getSimpleName());
		System.out.println(obj.getClass().getSimpleName());
	}
	static class Anakin {
	}
	static class Leia extends Anakin {
	}
	static class Kylo extends Leia {
	}
}

/*
Вам предстоит инициализировать объект obj таким классом, чтобы метод main выполнился без ошибок.
 */