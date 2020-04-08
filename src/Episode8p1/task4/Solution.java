package Episode8p1.task4;

public class Solution {
	public static void main(String[] args) {
		Food food = new Food();
		Selectable selectable = new Food();
		Food newFood = (Food) selectable;
		foodMethods(food);
		selectableMethods(selectable);
	}
	public static void foodMethods(Food food) {
		food.onEat();
		food.onSelect();
	}
	public static void selectableMethods(Selectable selectable) {
		selectable.onSelect();
	}
	interface Selectable {
		void onSelect();
	}
	static class Food implements Selectable{
		public void onEat() {
			System.out.println("The food was eaten");
		}
		public void onSelect() {
			System.out.println("The food was selected");
		}
	}
}
/*
Реализовать интерфейс Selectable в классе Food.
Метод onSelect() должен выводить на экран фразу "The food was selected".
Подумайте, какие методы можно вызвать для переменной food и какие для selectable.
В методе foodMethods вызовите методы onSelect, onEat, если это возможно.
В методе selectableMethods вызовите методы onSelect, onEat, если это возможно.
Явное приведение типов не использовать.
 */