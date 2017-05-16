package Module_2.Laba_2_4;

import java.util.Arrays;
import java.util.Random;
/**
 * Created by Serg_Smile on 08.04.2017.
 */
/*Create class Calculation, which will create two arrays of integers and
  use findMin and findMax static methods of MyMath class.*/

public class Calculation {

    public static int [] fillingArray(int length){
        if (length>0){
            int [] mas = new int[length];
            for (int i = 0; i < length; i++) mas[i] = new Random().nextInt(100)-50;
            return mas;
        }
        else {
            System.out.println("Array must have at least one element!!!");
            return null;
        }
    }

    public static void printArray(int[] arr){
        if (arr!=null) System.out.println("Our array:\n"+Arrays.toString(arr));
    }

    public static void printMax(int max){
        if (max!=0) System.out.println("MAX element: "+max);
    }

    public static void printMin(int min){
        if (min!=0) System.out.println("MIN element: "+min+"\n");
    }
}
