package Episode3p1.task9;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int n = 1;
        int m = 1;
        int i = 1;
        while (m < 10) {
            while (i < 10) {
                System.out.print((m*i)+" ");
                i++;
            }
            System.out.print("\n");
            m++;
            i = 1;
        }
    }
}