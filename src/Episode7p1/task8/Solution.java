package Episode7p1.task8;

public class Solution {
	public static void main(String[] args) {
	}
	public interface Fly {
		public void fly();
	}
	public interface Move {
		public void move();
	}
	public interface Eat {
		public void eat();
	}
	public class Rathtar implements Eat, Move{
		public void move() {

		}
		public void eat() {

		}
	}
	public class Starkiller implements Fly, Move{
		public void move() {

		}
		public void fly() {

		}
	}
	public class Jedi implements Move, Eat, Fly{
		public void move() {

		}
		public void eat() {

		}
		public void fly() {

		}
	}
}

/*
Подумайте и добавьте эти интерфейсы классам Rathtar, Starkiller, Jedi.
 */