package Episode7p2.task3;

public class Solution {
	public static void main(String[] args) throws Exception {
	}
	interface Person {
		void use(Person person);
		void startToTrain();
	}
	interface Trained {
		boolean wantsToGetExtraTrain();
	}
	interface Padavan extends Person{
	}
	interface Jedi extends Trained, Person{
	}
	class ExperiencedHuman implements Jedi{
		public void use(Person person) {
			person.startToTrain();
		}
		public void startToTrain() {
		}
		public boolean wantsToGetExtraTrain() {
			return true;
		}
	}
	class NotExperiencedHuman implements Padavan{
		public void use(Person person) {
		}
		public void startToTrain() {
		}
	}
}
/*
Добавьте интерфейсы Padavan и Jedi к классам ExperiencedHuman и NotExperiencedHuman. По одному на каждый. Подумайте, кому какой.
Унаследуйте интерфейсы Padavan и Jedi от
интерфейсов Person и Trained так, чтобы все методы у классов ExperiencedHuman и NotExperiencedHuman оказались объявленными в каком-то интерфейсе.
 */