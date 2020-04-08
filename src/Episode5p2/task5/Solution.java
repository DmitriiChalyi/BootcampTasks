package Episode5p2.task5;

import java.util.HashMap;
public class Solution {
	public static void main(String[] args) {
		try {
			HashMap<String, String> map = new HashMap<String, String>(null);
			map.put(null, null);
			map.remove(null);
		} catch (NullPointerException e) {
			System.out.println("OOPS! NullPointerException!...");
		}
		//напишите тут ваш код
	}
}