package Module_2.Laba_2_2_Methods.Lab_5;

/**
 * Created by Serg_Smile on 07.04.2017.
 */
public class A {
    void calcSquare(final int radius){
        double rez;
        rez = radius*radius*Math.PI;
        System.out.printf("Площа круга = %4.2f", rez);
    }

    void calcSquare(final int a, final int b){
        int rez;
        rez = a*b;
        System.out.print("Площа чотирикутника = "+rez);
    }

    void calcSquare(final int a, final int b, final int c){
        double rez, p=(a+b+c)/2;
        rez =  Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("Площа трикутника = %4.2f", rez);
    }
}
