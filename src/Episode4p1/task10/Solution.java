package Episode4p1.task10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[5];
        int i = 0;
        while (i < 5){
            array[i] = Integer.parseInt(reader.readLine());
            i++;
        }
        sort(array);
        i = 0;
        while (i != 5) {
            System.out.println(array[i]);
            i++;
        }
    }

    public static void sort(int[] array){
        for (int i = array.length-1; i > 0 ; i--) {
            for (int j = 0 ; j < i; j++) {
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}