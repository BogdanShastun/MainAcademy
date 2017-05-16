package Module_1.Laba_1_6;

import java.util.Arrays;

/**
 * Created by Serg_Smile on 19.03.2017.
 */
public class Laba_1_6_4 {
    public static void main(String [] args){
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        Arrays.sort(m);
        int index = Arrays.binarySearch(m,25);
        System.out.println(Arrays.toString(m));
        System.out.println(index);
    }
}
