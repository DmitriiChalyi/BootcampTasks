package Episode4p2.task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Select {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        int[] arr1 = new int[2];
        int[] arr2 = new int[2];
        int j = 0;
        int i = 0;
        for (i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        for (i = 0; i < 4; i++) {
            while (i < 2) {
                arr1[i] = arr[i];
                i++;
            }
        }
        for (i = 2; i < 4; i++) {
            while (i < 4) {
                arr2[j] = arr[i];
                i++;
                j++;
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for (i = 0; i < arr1.length; i++) {
            sum1 = sum1 + arr1[i];
            sum2 = sum2 + arr2[i];
        }
        String intArrayString1 = Arrays.toString(arr1);
        String intArrayString2 = Arrays.toString(arr2);
        if (sum1 < sum2){
            System.out.println(sum2);
            System.out.println(intArrayString2);
        }
        else {
            System.out.println(sum1);
            System.out.println(intArrayString1);
        }
    }
}
/*
    String intArrayString = Arrays.toString(intArray);

        System.out.println(intArrayString);
// [1, 2, 3, 4, 5]

/*
Программа должна создавать большой массив на 20 целых чисел.
Программа должна считывать с клавиатуры 20 чисел для большого массива.
Программа должна создавать два маленьких массива на 10 чисел каждый.
Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести второй маленький массив на экран.
 */