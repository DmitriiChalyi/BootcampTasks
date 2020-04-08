package Episode4p1.task6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }
    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(reader.readLine());
        return d;
    }
    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double g = Double.parseDouble(reader.readLine());
        return g;
    }
    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean h = Boolean.parseBoolean(reader.readLine());
        return h;
    }
    public static void main(String[] args) throws Exception {
    }
}
/*
String readString() - читает с клавиатуры строку
int readInt() - читает с клавиатуры число
double readDouble() - читает с клавиатуры дробное число
boolean readBoolean() - читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
 */
