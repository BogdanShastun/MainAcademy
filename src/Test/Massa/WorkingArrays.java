package Test.Massa;

import java.util.Random;

/**
 * Created by Serg_Smile on 26.05.2017.
 */

public class WorkingArrays {
    static Random random = new Random(2014);
    static int lenght = random.nextInt(15)+5;

    static void fullArray(int[] mas){
        for (int i=0; i < lenght; i++) {
            mas[i] = random.nextInt(140)+20;
        }
    }

    static int SumElementOfArray(int[] mas){
        int sum = 0;
        for (int element : mas) sum+=element;
        return sum;
    }

    static void arraySort(int[] mas){
        int rez;
        for (int i = 0; i < lenght; i++) {
            for (int j = i; j < lenght; j++) {
                if (mas[j] > mas[i]) {
                    rez = mas[i];
                    mas[i] = mas[j];
                    mas[j] = rez;
                }
            }
        }
    }

    static void printArrays(int[] mas1, int[] mas2, int div){
        System.out.println("1-Я ГРУППА ЛЮДЕЙ: ");
        printElemetOfArray(mas1);
        System.out.println("2-Я ГРУППА ЛЮДЕЙ: ");
        printElemetOfArray(mas2);
        System.out.println("Разница веса на даный момент = "+div+"\n_______________________________________________");
    }

    static void printElemetOfArray(int[] mas){
        int peopleCount=0;
        System.out.print("{ ");
        for (int element : mas) {
            if (element > 0){
                peopleCount++;
                System.out.print(element+" ");
            }
        }
        System.out.println("}\nВ этой группе: "+peopleCount+" чел.");
        System.out.println("Сума веса: "+ SumElementOfArray(mas)+" кг.");
    }
}
