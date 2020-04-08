package Episode7p1.task9;

public class Solution {
	public static void main(String[] args) {
		Sith sith = new Youngling();
		sith.setSide("I am choosing the Light Side");
		System.out.println(sith.getSide());
	}
	public static class Sith {
		public String side;
		public Sith() {
		}
		public String getSide() {
			return side;
		}
		public void setSide(String side) {
			this.side = side;
		}
	}
	public static class Youngling extends Sith {
		public String getSide() {
			return ("Dark");
		};
		public void setSide(String side) {
			this.side = side;
		}
	}
}

/*
Переопределите метод setSide в классе Youngling так, чтобы программа выдавала на экран надпись “I am choosing the Dark Side”.
 */