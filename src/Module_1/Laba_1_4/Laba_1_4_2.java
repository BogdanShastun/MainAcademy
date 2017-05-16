package Module_1.Laba_1_4;

import java.util.Scanner;

/**
 * Created by Serg_Smile on 11.03.2017.
 */
public class Laba_1_4_2 {
    public static void main (String [] args){
        int i1=200, i2=23;
        double d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        i1=sc.nextInt();
        System.out.print("Введіть друге число: ");
        i2=sc.nextInt();
        d=i1;
        d/=i2;
        System.out.println("Сумма = "+(i1+i2));
        System.out.println("Віднімання = "+(i1-i2));
        System.out.println("Множення = "+(i1*i2));
        System.out.println("Ділення =  "+d);
        System.out.println("Ціла частина від ділення = "+(i1/i2));
        System.out.println("Залишок від ділення = "+(i1%i2));
    }
}
