package Episode7p2.task8;

public class Solution {
	public static void main(String[] args) {
	}
	public interface Swordfight {
		void swordfight();
	}
	public interface Shoot {
		void shoot();
	}
	public interface Force {
		void force();
	}
	public class Finn implements Shoot, Swordfight {

		public void swordfight() {
		}
		public void shoot() {
		}
	}
	public class Rey implements Shoot, Force {

		public void shoot() {
		}

		public void force() {
		}
	}
	public class Ren implements Force, Swordfight {
		public void swordfight() {
		}
		public void force() {
		}
	}
}
/*
	Класс Finn должен быть объявлен внутри класса Solution.
		Класс Rey должен быть объявлен внутри класса Solution.
		Класс Ren должен быть объявлен внутри класса Solution.
		Finn может стрелять и биться на мечах.
		Rey может применять Силу и стрелять.
		Ren может биться на мечах и применять Силу.

 */