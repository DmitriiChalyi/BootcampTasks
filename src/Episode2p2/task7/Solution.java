package Episode2p2.task7;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (getYear(number)<0){
            System.out.println(Math.abs(getYear(number)) + " year before Yawin");
        }
        else {
            System.out.println(getYear(number) + " year after Yawin");
        }
    }

    public static int getYear(int number){
        return number - 35;
    }
}
