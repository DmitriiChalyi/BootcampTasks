package Episode4p2.task4;

import java.util.ArrayList;
public class ArrList {
	public static void main(String[] args) {
		ArrayList<String> deliveryCities = new ArrayList<>();
		deliveryCities.add("Chicago");
		deliveryCities.add("Balashikha");
		deliveryCities.add("New York");
		deliveryCities.add("Toronto");
		deliveryCities.add("Paris");
		System.out.println(deliveryCities.size());
		for (int i = 0; i < deliveryCities.size(); i++)
			System.out.println(deliveryCities.get(i));
	}
}

/*
Создайте список строк.
Добавьте в него 5 различных строк.
Выведите его размер на экран.
Используя цикл выведите его содержимое на экран, каждое значение с новой строки.
 */