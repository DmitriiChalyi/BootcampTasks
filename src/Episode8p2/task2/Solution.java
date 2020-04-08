package Episode8p2.task2;

public class Solution {
	public static void main(String[] args) {
	}
	public static class MultiTroopTransport{
		public void printlnUsage() {
			System.out.println(Constants.RESISTANCE);
		}
	}
	public static class AllTerrainArmoredTransport{
		public void printlnUsage() {
			System.out.println(Constants.FIRSTORDER);
		}
	}
	public static class TransportResistance extends MultiTroopTransport{
		public void printlnUsage() {
			System.out.println(Constants.ATAT);
		}
	}
	public static class TransportFirstOrder extends AllTerrainArmoredTransport{
		public void printlnUsage() {
			System.out.println(Constants.MTT);
		}
	}
	public static class Constants {
		public static String MTT = "I can transport drones";
		public static String ATAT = "I can shot";
		public static String RESISTANCE = "I am from Resistance";
		public static String FIRSTORDER = "I am from First Order";
	}
}

/*
Для вывода используй только переменные из класса Constants.
В классе MultiTroopTransport реализуйте метод printlnUsage, чтобы он выводил на экран "I can transport drones".
В классе AllTerrainArmoredTransport реализуйте метод printlnUsage, чтобы он выводил на экран "I can shot".
Создайте public static класс TransportResistance.
Создайте public static класс TransportFirstOrder.
Унаследуйте MultiTroopTransport и AllTerrainArmoredTransport от TransportResistance и TransportFirstOrder, подумайте, какой класс для кого.
В классе TransportResistance реализуйте метод printlnUsage, чтобы он выводил на экран "I am from Resistance".
В классе TransportFirstOrder реализуйте метод printlnDesire, чтобы он выводил на экран "I am from First Order".
В классах TransportResistance и TransportFirstOrder для метода printlnDesire расставьте различными способами
модификаторы доступа так, чтобы в классах MultiTroopTransport и AllTerrainArmoredTransport выполнялось расширение видимости.
 */