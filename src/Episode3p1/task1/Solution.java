package Episode3p1.task1;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name1;
        name1 = scanner.nextLine();
        String name2;
        name2 = scanner.nextLine();

        if ((name1.equals("Anakin")) && (name2.equals("Obi")))
            System.out.println(name1+" and "+name2+" - friends");
        else if ((!name1.equals("Anakin")) && (name2.equals("Obi")))
            System.out.println(name1+" - foe, "+name2+" - friend");
        else if ((name1.equals("Anakin")) && (!name2.equals("Obi")))
            System.out.println(name1+" - friend, "+name2+" - foe");
        else
            System.out.println(name1+" and "+name2+" - foes");
    }
}
