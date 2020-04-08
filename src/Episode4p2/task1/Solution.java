package Episode4p2.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initArr();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initArr() throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < 5; i++)
            array[i] = Integer.parseInt(buff.readLine());
        return array;
    }

    public static int max(int[] array) {
        Arrays.sort(array);
        return array[array.length-1];
    }
}
