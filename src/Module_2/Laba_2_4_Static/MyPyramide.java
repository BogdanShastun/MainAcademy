package Module_2.Laba_2_4_Static;

/**
 * Created by Serg_Smile on 09.04.2017.
 */
/*Write a class MyPyramid with public static method printPyramid(int h)
that takes parameter an integer h between 1 and 9, and prints a pyramid of numbers of height h.
Example: For h = 4 the method should print the pyramid
   1
  121
 12321
1234321*/
public class MyPyramide {

    public static void printPyramide(int h){
        if (h>0 && h<10){
           for (int i = 1; i <= h; i++) {
               for (int j = i; j < h; j++) System.out.print(" ");
               for (int j = 1; j <= i; j++) System.out.print(j);
               for (int j = i-1; j > 0; j--) System.out.print(j);
               System.out.println("");
           }
        } else System.out.println("The parameter must be an integer between 1 and 9.");
    }
}
