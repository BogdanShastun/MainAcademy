package Module_2.Laba_2_4;

/**
 * Created by Serg_Smile on 08.04.2017.
 */
/*The value of π can be calculated with the series: π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
  Write a class MyCalc with public static method calcPi(int) that takes as parameter an integer n,
  and computes and returns the value of π approximated to the first n terms of the series.*/
public class MyCalc {
    private static int n=0;
    public static double calcPi(int n){
        double result = 4, count = 3;
        final double FOUR = 4;
        boolean operation = true;
        MyCalc.n = n;
        if (n>1) {
            for (int i = 1; i < n; i++, count+=2) {
                if (operation) {
                    result -= FOUR/count;
                    operation=false;
                }
                else {
                    result += FOUR/count;
                    operation = true;
                }
            }
        } else
        if (n<1){
            System.out.println("The number entered is not valid!!! \n");
            result=0;
        }
        return result;
    }

    public static void printPi(double result){
        if (n>0) System.out.printf("The value of π approximated to the first %d terms of the series: %.2f \n\n",n , result);
    }
}
