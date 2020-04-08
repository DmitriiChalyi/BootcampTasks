package Episode5p2.task7;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
public class Solution {
	public static void main(String[] args) throws Exception {
		try {
			method1();
		} catch (NullPointerException d) {
			System.out.println("catched");
		} catch (FileNotFoundException c) {
			System.out.println("catched");
		}
	}
	public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
		int i = (int) (Math.random() * 4);
		if (i == 0) {
			throw new NullPointerException();
		} else if (i == 1) {
			throw new ArithmeticException();
		} else if (i == 2) {
			throw new FileNotFoundException();
		} else if (i == 3) {
			throw new URISyntaxException("", "");
		}
	}
}

/*
У нас есть метод. Он выбрасывает два исключения, унаследованные от Exception, и два унаследованных от
RuntimeException: NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.

 Задание: необходимо перехватить NullPointerException и FileNotFoundException,
без перехвата ArithmeticException и URISyntaxException.
 */
