package Episode5p2.task2;

public class Solution {
	public static void main(String[] args) {
		try {
			String s = null;
			String m = s.toLowerCase();
		} catch (NullPointerException m) {
			System.out.println("OMG NullPointerEx");
		}
	}
}

/*
Программа должна выводить сообщение на экран.
В программе должен быть блок try-catch.
Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
Выведенное сообщение должно содержать тип возникшего исключения.
Имеющийся код в методе main не удалять.
 */