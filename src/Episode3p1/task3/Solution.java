package Episode3p1.task3;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if (value == 0)
            System.out.println("it is a balance");
        if (value > 0)
            System.out.println("it’s Light side");
        else if (value < 0)
            System.out.println("it’s Dark side");
    }
}