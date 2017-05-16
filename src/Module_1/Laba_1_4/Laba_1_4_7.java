package Module_1.Laba_1_4;

import java.util.Scanner;

/**
 * Created by Serg_Smile on 12.03.2017.
 */
public class Laba_1_4_7 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введыть перше число: ");
        int chislo1=scan.nextInt();
        System.out.print("Введыть друге число: ");
        int chislo2=scan.nextInt();
        int RaznitsaChisel=(chislo1>=chislo2)?(chislo1-chislo2):(chislo2-chislo1);
        System.out.println("Різниця введених чисел: "+RaznitsaChisel);
    }
}
