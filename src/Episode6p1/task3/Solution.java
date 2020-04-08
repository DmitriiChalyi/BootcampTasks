package Episode6p1.task3;

public class Solution {
	public static void main(String[] args) {
		float f = (float) 128.50;
		int i = (int) f;
		int b = (byte) (i + f);
		System.out.println(b);
	}
}
/*
Давайте тоже найдем решение задачи: у нас есть какие-то переменные,
преобразованные в другой тип, но их недостаточно.
Нужно добавить одну операцию по преобразованию типа, чтобы получался нужный нам ответ b = 0.
 */