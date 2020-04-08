package Episode2p1.task5;

public class Solution {
	public static void main(String[] args) {
		Dias dias = new Dias();
		Clone1 clone1 = new Clone1();
		clone1.owner = dias;
		Clone2 clone2 = new Clone2();
		clone2.owner = dias;
		Clone3 clone3 = new Clone3();
		clone3.owner = dias;
	}
	public static class Clone1 {
		public Dias owner;
	}
	public static class Clone2 {
		public Dias owner;
	}
	public static class Clone3 {
		public Dias owner;
	}
	public static class Dias {
	}
}