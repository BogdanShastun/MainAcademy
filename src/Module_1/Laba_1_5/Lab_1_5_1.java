package Module_1.Laba_1_5;

/**
 * Created by Serg_Smile on 16.03.2017.
 */
public class Lab_1_5_1 {
    public static void main(String[] args) {


        for (int i = 1; i < 9; i++) {
            boolean test = false;
            int num = i;
            while (!test) {
                System.out.print(" " + num);
                if (num == 1) test = true;
                --num;
            }
            System.out.println();
        }
    }
}
