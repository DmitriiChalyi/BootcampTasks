package Episode7p1.task1;

public class Main {
	public static void main(String[] args) {
		Empire empire = new Order();
		System.out.println(empire.getName());
	}
	public static class Empire {
		public String getName() {
			return "Fall of the Galaxy Empire";
		}
	}
	public static class Order extends Empire {
		public String getName(){
			return "Order";
		}
	}
}

/*
Давайте напишем правильный геттер для класса Order, чтобы программа выдавала фразу «Rise of the First Order». 
Нужно переопределить метод getName в классе Order, чтобы программа выдавала: «Rise of the First Order»
 */