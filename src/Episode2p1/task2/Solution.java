package Episode2p1.task2;

public class Solution {
	public static void main(String[] args) {
		Zam zam = new Zam();
		Dron dron = new Dron();
		dron.hunter = zam;
		zam.spy = dron;
	}
	public static class Zam {
		public int age;
		public int height;
		public Dron spy;
	}
	public static class Dron {
		public int wheel;
		public int eye;
		public Zam hunter;
	}
}