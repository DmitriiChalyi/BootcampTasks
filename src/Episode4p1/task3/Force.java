package Episode4p1.task3;

public class Force {

    static int theForce;
    int i = theForce + 1;
    protected void finalize() throws Throwable {
        int i = theForce--;
    }

}
