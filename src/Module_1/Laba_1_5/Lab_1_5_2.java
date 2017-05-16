package Module_1.Laba_1_5;

import java.util.Scanner;

/**
 * Created by Serg_Smile on 16.03.2017.
 */
public class Lab_1_5_2 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x>9) System.out.println("Задане число більше дев'яти"); else
            switch (x){
                case 0: System.out.println("Нуль"); break;
                case 1: System.out.println("Один"); break;
                case 2: System.out.println("Два"); break;
                case 3: System.out.println("Три"); break;
                case 4: System.out.println("Чотири"); break;
                case 5: System.out.println("П'ять"); break;
                case 6: System.out.println("Шість"); break;
                case 7: System.out.println("Сім"); break;
                case 8: System.out.println("Вісім"); break;
                case 9: System.out.println("Дев'ять"); break;
                default: System.out.println("Число від'ємне"); break;
            }
    }
}
