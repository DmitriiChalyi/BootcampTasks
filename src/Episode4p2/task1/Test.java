package Episode4p2.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception{
        int[] massiv = initMassiv();
        int findMax = findMax(massiv);
    }

    public static int[] initMassiv() throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int[] massiv = new int[3];
        for (int i = 0; i < 3; i++){
            massiv[i] = Integer.parseInt(buff.readLine());
        }
        return massiv;
    }

    public static int findMax(int[] massiv) {
        Arrays.sort(massiv);
        return massiv[massiv.length-1];
    }
}
