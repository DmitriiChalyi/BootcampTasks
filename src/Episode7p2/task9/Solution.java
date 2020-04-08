package Episode7p2.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		FileInputStream inStream = new FileInputStream(reader.readLine());
		reader.close();
		while (inStream.available() > 0) {
			System.out.print((char)inStream.read());
		}
		inStream.close();
	}
}


/*
Программа должна считывать c консоли имя файла.
Программа должна выводить на экран содержимое файла.
Поток чтения из файла (FileInputStream) должен быть закрыт.
BufferedReader также должен быть закрыт.
 */