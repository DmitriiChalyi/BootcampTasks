package Episode8p2.task9;

public class Solution {

	public static Jedi jedi;

	static {
		jedi = new Jedi();
		jedi.name = "Anakin";
		System.out.println(jedi.name);
	}

	public static void main(String[] args) {

	}

	public static class Jedi {
		public String name;
	}
}