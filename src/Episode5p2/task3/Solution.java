package Episode5p2.task3;

public class Solution {
	public static void main(String[] args) {
		try{
		int[] m = new int[3];
		m[6] = 5;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("OOOPS ArrayIndexOutOfBoundsException");
		}
	}
}