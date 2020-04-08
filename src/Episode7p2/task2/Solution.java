package Episode7p2.task2;

public class Solution {
	public static void main(String[] args) throws Exception {
	}

	interface StarKiller {
		public boolean Destroy();
	}
	interface Presentable extends StarKiller {

	}
}

/*
Создайте интерфейс StarKiller.
Добавьте в него метод Destroy(), который сообщает о том, что объект уничтожен. 
Подумайте, какой тип должен возвращать этот метод.
Создайте интерфейс Presentable.
Унаследуйте интерфейс Presentable от интерфейса StarKiller.
 */
