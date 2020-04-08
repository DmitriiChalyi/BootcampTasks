package Episode7p1.task10;

public class Solution {
	public static void main(String[] args) {
		Padavan padavan = new Padavan();
		System.out.println(padavan);
	}
	public static interface YodaStyle {
		public void workHard();
	}
	public static class Padavan extends Jedi implements YodaStyle {

	}
	public static class Jedi implements YodaStyle {
		public void workHard() {

		}
	}
}