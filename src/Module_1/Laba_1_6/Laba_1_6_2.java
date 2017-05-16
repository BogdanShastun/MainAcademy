package Module_1.Laba_1_6;

/**
 * Created by Serg_Smile on 19.03.2017.
 */
public class Laba_1_6_2 {
    public static void main (String [] args){
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        int max=m[0], min=m[0], sum=0, avg=0;
        for (int i=0; i<m.length; i++) {
            if (m[i]>max) max=m[i];
            if (m[i]<min) min=m[i];
            sum+=m[i];
        }
        avg=sum/m.length;
        System.out.println("max = "+max);
        System.out.println("min = "+min);
        System.out.println("average = "+avg);
    }
}
