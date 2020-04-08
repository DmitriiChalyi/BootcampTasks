package Episode2p2.task6;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(322));
    }
    public static int sumDigitsInNumber(int number) {
        int s = 0;
        int i = 0;
        while (number > 0)
        {
            s = number % 10;
            number = number / 10;
            i = i + s;
        }
        return(i);
    }
}
