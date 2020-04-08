package Episode5p2.task4;

import java.util.ArrayList;
public class Solution {
	public static void main(String[] args) {
		try {
		ArrayList<String> list = new ArrayList<String>();
		String s = list.get(18);
		} catch (IndexOutOfBoundsException s) {
			System.out.println("OMG IndexOutOfBoundsException");
		}
		//напишите тут ваш код
	}
}
