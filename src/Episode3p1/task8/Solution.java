package Episode3p1.task8;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int i = 0;
        while (m > 0)
        {
            while (i < n)
            {
                System.out.print("*");
                i++;
            }
            System.out.println("*");
            m--;
            i = 0;
        }

    }
}
