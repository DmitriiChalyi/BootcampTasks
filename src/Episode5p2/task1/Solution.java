package Episode5p2.task1;

public class Solution {
	public static void main(String[] args) {
		try
		{
			int a = 42 / 0;
		} catch (ArithmeticException a) {
			System.out.println("division by zero");
		}
	}
}
