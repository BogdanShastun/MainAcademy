package Test.Lessons;
import Test.Lessons.qqq.*;

import java.util.logging.*;

import static sun.misc.Version.print;

public class Main {

    public static void main(String[] args){

        boolean a= false;
        assert (a) : a = true;
        if (a) System.out.println("assert is on");
    }

    public static int getAreaValue(int x, int y)throws Exception{
        if(x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative: x="+x+", y="+y);
        return x*y;
    }

    public static void testExcp2() throws Exception {
        int x = 10/1;
        System.out.println("End");
    }
}
