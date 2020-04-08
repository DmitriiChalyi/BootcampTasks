package Episode2p1.task10;

public class Solution{
    public static int max(int a, int b, int c, int d) {
        return(max(max(a,b), max(c,d)));
    }

    public static int max(int a, int b) {
        if (a > b){
            return a;}
        else{
            return b;}
    }
    public static void main(String[] args) throws Exception {
        System.out.println(max(-20, -10));
        System.out.println(max(-40, -10, -30, 40));
        System.out.println(max(-20, -40, -30, 40));
        System.out.println(max(-20, -10, -40, 40));
        System.out.println(max(-20, -10, -30, -40));
    }
}