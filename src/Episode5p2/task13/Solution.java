package Episode5p2.task13;

public class Solution {
	public static void main(String[] args) {
		try {
			divideByZero();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("haha catched");
		}
	}

	public static void divideByZero() {
		int a = 42 / 0;
		System.out.println(a);
	}

}

/*
Создайте метод public static void divideByZero, в котором поделите любое число на ноль и выведите на экран результат деления.
Оберните вызов метода divideByZero в try..catch. Выведите стек-трейс исключения используя метод exception.printStackTrace()
 */