package Episode6p2.task10;

public class Solution {
	public static void main(String[] args) {
	}
	abstract class ForceUser {
		abstract void UseForce();
	}
	public class Jedi extends ForceUser {
		void UseForce() {
			System.out.println("push item");
		}
	}
	public class Sith extends ForceUser {
		void UseForce() {
			System.out.println("use the lightning");
		}
	}
}

/*
Нужно создать абстрактный класс ForceUser с абстрактными методами UseForce().

Нужно создать два класса Jedi, Sith и определить методы абстрактного класса.
Для Джедая выводит строчку "push item", а для Ситха "use the lightning".
 */