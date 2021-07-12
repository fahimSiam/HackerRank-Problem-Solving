import java.io.*;
import java.util.*;

final class Inner {
    class Private {
        String powerof2(int num) {
            return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
        }
    }
}

public class CanYouAccess {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner meaw = new Scanner(System.in);
        int num = meaw.nextInt();
        Inner inner = new Inner();
        Inner.Private p = inner.new Private();
        System.out.println(num+ " is "+ p.powerof2(num));
        Object o;
        o=p;
        System.out.println("An instance of class: Solution."+o.getClass().getCanonicalName()+" has been created");
    }
}