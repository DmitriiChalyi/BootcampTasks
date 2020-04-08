package Episode6p1.task1;

public class Solution {
	public static void main(String[] args) {
		int a = 0;
		int b = (char) a + 46;
		byte c = (byte) (a * b);
		double f = (int) 1234.15;
		long d = (char) (a + f / c + b);
		System.out.println(d);
	}
}