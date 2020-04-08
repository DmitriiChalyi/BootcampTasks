package Episode8p1.task2;

public class Solution {
	public static void main(String[] args) {
		Animal animal = new Porg();
		boolean isPorg = animal instanceof Porg;
		boolean isMovable = animal instanceof CanMove;
		boolean isAnimal = animal instanceof Animal;
		if (isPorg && isMovable && isAnimal) System.out.println("Ahhh!");
	}
	interface CanMove {
	}
	static class Animal implements CanMove {
	}
	static class Porg extends Animal {
	}
}

/*
Исправь программу так, чтобы в переменной animal хранился объект, который одновременно является и CanMove, и Porg, и Animal.
 */
