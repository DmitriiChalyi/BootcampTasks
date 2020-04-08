package Episode3p1.task4;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if (value == 0)
            System.out.println("balance");
        else if (value > 0 && value % 2 == 0)
            System.out.println("compassion");
        else if (value > 0 && value % 2 != 0)
            System.out.println("mercy");
        else if (value < 0 && value % 2 == 0)
            System.out.println("pain");
        else if (value < 0 && value % 2 != 0)
            System.out.println("anger");
    }
}
/*
    Напишите программу, которая принимает числа, если число положительное и четное - программа должна выводить :
        «compassion», если положительное и нечетное: «mercy», если отрицательное и четное - «pain»,
        если отрицательное и нечетное: «anger», если = 0: «balance».
 */