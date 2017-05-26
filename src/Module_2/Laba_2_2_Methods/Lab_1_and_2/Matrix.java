package Module_2.Laba_2_2_Methods.Lab_1_and_2;

import java.util.Random;

/**
 * Created by Serg_Smile on 06.04.2017.
 */
public class Matrix {
    private int[][] arr1 = new int[10][10], arr2 = new int[10][10];

    public int[][] getArr1() {
        return arr1;
    }

    public int[][] getArr2() {
        return arr2;
    }

    public void filling (){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.arr1[i][j]=random.nextInt(98)+1;
                this.arr2[i][j]=random.nextInt(98)+1;
            }
        }
    }

    public void printArray(int[][] arr){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("| %4d ",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] sumArray (int[][] arr1,int[][] arr2){
        int[][] resArr = new int[10][10];
        System.out.println("Результат сложения двух массивов:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                resArr[i][j]= arr1[i][j]+arr2[i][j];
            }
        }
        return resArr;
    }

    public  int[][] dubArray (int[][] arr1, int[][] arr2){
        int[][] resArr = new int[10][10];
        System.out.println("Результат умножения двух массивов:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                resArr[i][j]= arr1[i][j]*arr2[i][j];
            }
        }
        return resArr;
    }
}
