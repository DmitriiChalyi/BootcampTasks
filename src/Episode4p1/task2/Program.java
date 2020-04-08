package Episode4p1.task2;

public class Program {
    public static void main(String[] args) {
    }
    protected void finalize()throws Throwable {
        System.out.println("Jedi was destroyed");
    }
}
class Sith {
    protected void finalize()throws Throwable {
        System.out.println("Sith was destroyed");
    }
}
