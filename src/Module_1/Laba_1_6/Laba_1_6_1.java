package Module_1.Laba_1_6;

import java.util.Arrays;

/**
 * Created by Serg_Smile on 19.03.2017.
 */
public class Laba_1_6_1 {
    public static void main (String [] args){
        int mass [] = new int[15];
        int count=0;
        for (int i=2; i<=30; i+=2) {
            if (i%2==0) mass[count++]=i;
        }
        System.out.println(Arrays.toString(mass));
    }
}
