package Module_1.Laba_1_5;

import java.util.Scanner;

/**
 * Created by Serg_Smile on 16.03.2017.
 */
public class Lab_1_5_5 {
    public static void main(String [] args){
        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        int sum = 0, n = scan.nextInt();
        for (int i=1; i<=n; i++) sum+=i;
        float avg = sum/n; //maybe int!?
        System.out.println("Sum = "+sum);
        System.out.println("avg = "+avg);

    }
}
