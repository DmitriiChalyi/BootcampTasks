package Episode5p2.task10;

import java.io.IOException;
import java.rmi.RemoteException;

public class Solution {
	public static void main(String[] args) {
		handleExceptions(new Solution());
	}
	public static void handleExceptions(Solution obj) {
		for (int i=0; i<3; i++ ){
			try{
				switch(i){
					case 0:
						obj.method1();
					case 1:
						obj.method2();
					case 2:
						obj.method3();
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
	public void method1() throws IOException {
		throw new IOException();
	}
	public void method2() throws NoSuchFieldException {
		throw new NoSuchFieldException();
	}
	public void method3() throws RemoteException {
		throw new RemoteException();
	}
}

/*
В методе handleExceptions нужно обработать все checked исключения.
Вывести на экран возникшее checked исключение. Можно использовать только один блок try..catch
 */