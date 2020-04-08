package Episode5p2.task11;

public class Solution {
	public static void main(String[] args) {
		handleExceptions(new Solution());
	}
	public static void handleExceptions(Solution obj) {
		for (int i=0; i<3; i++ ){
			try{obj.method1();
				obj.method2();
				obj.method3();
			}
			catch(RuntimeException e){
				printStack(e);
			}
		}
	}
	public static void printStack(Throwable throwable) {
		System.out.println(throwable);
		for (StackTraceElement element : throwable.getStackTrace()) {
			System.out.println(element);
		}
	}
	public void method1() {
		throw new NullPointerException();
	}
	public void method2() {
		throw new IndexOutOfBoundsException();
	}
	public void method3() {
		throw new NumberFormatException();
	}
}
/*
Пришла пора: в методе handleExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..catch.
 */