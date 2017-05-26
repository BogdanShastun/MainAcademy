package Test.Massa;

/**
 * Created by Serg_Smile on 25.05.2017.
 */

public class Main extends WorkingArrays{
    public static void main(String[] args) {
        int div;
        //int[] array = {108, 90, 60, 47, 39, 29, 20};
        int[] array = new int [lenght];
        int[] arr1 = new int[lenght], arr2 = new int[lenght];
        fullArray(array);
        arraySort(array);
        System.out.println("_______________________________________________\nЗАДАН МАССИВ:");
        printElemetOfArray(array);
        System.out.println("_______________________________________________\n");
        constructFirst(arr1, arr2, array);
        boolean test = true;
        while (test){
            div = Math.abs(SumElementOfArray(arr1)- SumElementOfArray(arr2));
            //printArrays(arr1, arr2, div);
            if (div/2 >= 1 && SumElementOfArray(arr1) > SumElementOfArray(arr2)) test = constructNext(arr1,arr2,div);
            else test = constructNext(arr2,arr1,div);
        }
        System.out.println("МИНИМАЛЬНАЯ РАЗНИЦА ВЕСА ДВУХ ГРУП: "+Math.abs(SumElementOfArray(arr1)- SumElementOfArray(arr2)));
    }

    static void constructFirst(int[] mas1, int[] mas2, int[] array){
        int indexArr1=0, indexArr2=0;
        for (int i = 0; i < lenght; i++) {
            if (SumElementOfArray(mas1) > SumElementOfArray(mas2)){
                mas2[indexArr2] = array[i];
                indexArr2++;
            }
            else {
                mas1[indexArr1] = array[i];
                indexArr1++;
            }
        }
    }

    static boolean constructNext(int[] mas1, int[] mas2, int razn) {
        int indexFirstMas1 = -1, indexFirstMas2 = -1, indexSecondMas2 = -1, max = 0;
        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j < lenght; j++) {
                if (mas1[i] - mas2[j] <= razn / 2 && mas1[i] - mas2[j] > 0 && mas1[i] - mas2[j] > max) {
                    max = mas1[i] - mas2[j];
                    indexFirstMas1 = i;
                    indexFirstMas2 = j;
                    indexSecondMas2 = -1;
                }
            }
            for (int k = lenght - 1; k > 0; k--) {
                for (int l = k - 1; l >= 0; l--) {
                    if (mas1[i] - (mas2[k] + mas2[l]) <= razn / 2 && mas1[i] - (mas2[k] + mas2[l]) > 0 && mas1[i] - (mas2[k] + mas2[l]) > max) {
                        max = mas1[i] - (mas2[k] + mas2[l]);
                        indexFirstMas1 = i;
                        indexFirstMas2 = k;
                        indexSecondMas2 = l;
                    }
                }
            }

        }

        if (indexFirstMas1 >= 0 && indexFirstMas2 >= 0 && indexSecondMas2 == -1) {
            replace(mas1, mas2, indexFirstMas1, indexFirstMas2);
            return true;
        }
        if (indexSecondMas2 >= 0) {
            replace(mas1, mas2, indexFirstMas1, indexFirstMas2, indexSecondMas2);
            return true;
        }
        return false;
    }

    static void replace(int[] mas1, int[] mas2, int indexFirstMas1, int indexFirstMas2){
        int rezerv;
        System.out.println(mas1[indexFirstMas1]+" --> "+mas2[indexFirstMas2]);
        rezerv = mas1[indexFirstMas1];
        mas1[indexFirstMas1] = mas2[indexFirstMas2];
        mas2[indexFirstMas2] = rezerv;
        arraySort(mas1);
        arraySort(mas2);
    }

    static void replace(int[] mas1, int[] mas2, int indexFirstMas1, int indexFirstMas2, int indexSecondMas2){
        System.out.println(mas1[indexFirstMas1]+" --> "+mas2[indexFirstMas2]+" and "+mas1[lenght-1]+" --> "+mas2[indexSecondMas2]);
        mas2[lenght-1] = mas1[indexFirstMas1];
        mas1[indexFirstMas1] = 0;
        mas1[lenght-2] = mas2[indexFirstMas2];
        mas2[indexFirstMas2] = 0;
        mas1[lenght-1] = mas2[indexSecondMas2];
        mas2[indexSecondMas2] = 0;
        arraySort(mas1);
        arraySort(mas2);
    }
}
