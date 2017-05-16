package Module_1.Laba_1_6;

import java.util.Arrays;

/**
 * Created by Serg_Smile on 19.03.2017.
 */
public class Laba_1_6_3 {
    public static void main(String [] args){
        int mas [][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            int chislo = i+1;
            for (int j = 0; j < 4; j++) {
                mas[i][j]=chislo;
                chislo+=4;
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(mas[i]));
        }
    }
}
