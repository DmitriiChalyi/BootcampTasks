package Episode8p2.task3;

public class Solution {
	public static void main(String[] args) {
		printMatrix(2, 3, "8");
	}

	public static void printMatrix(int m, int n, String value) {
		System.out.println("fill with String objects");
		printMatrix(m, n, (Object) value);
		printMatrix(23, 44, "OOPS");
	}

	public static void printMatrix(int m, int n, Object value) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(value);
			}
			System.out.println();
		}
	}

	public static void printMatrix(double m, double n, String value) {
		System.out.println("double");
	}

	public static void printMatrix(int m, int n, Integer value) {
		System.out.println(m + n + value);
	}

	public static void printMatrix(int m, int n, Double value) {
		System.out.println(m + n + value);
	}

	public static void printMatrix(int m, Object value, int n) {
		System.out.println();
	}

	public static void printMatrix(int m, Integer value, int n) {
		System.out.println(m + n + value);
	}

	public static void printMatrix(int m, String value, String n) {
		System.out.println(m + n + value);
	}

	public static void printMatrix(String m, String value, String n) {
		System.out.println(m + n + value);
	}

	public static void printMatrix(Object m, Object value, int n) {
		System.out.println();
	}
}
