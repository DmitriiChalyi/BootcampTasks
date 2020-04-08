package Episode4p2.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Jedi {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[5];
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            list[i] = reader.readLine();
        }
        for (int i = 0; i < list.length; i++) {
             arr[i] = list[i].length();
            System.out.println(arr[i]);
        }
    }
}
/*
Создать массив на 10 строк.
Создать массив на 10 чисел.
Ввести с клавиатуры 10 строк, заполнить ими массив строк.
В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 */