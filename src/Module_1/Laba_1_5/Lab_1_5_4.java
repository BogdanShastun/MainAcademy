package Module_1.Laba_1_5;

/**
 * Created by Serg_Smile on 16.03.2017.
 */
public class Lab_1_5_4 {
    public static void main(String [] args){
        int count = 0;
        for (int i=1; i<=300; i++){             //First option loop
            if ((i%3==0)||(i%4==0)){
                System.out.println(i);
                count++;
            }
            if (count==10){ count=0; break; }
        }
        for (int i=1; i<=300; i++){             //Second option loop
            if (((i%3==0)||(i%4==0))&&(count<10)){
                System.out.println(i);
                count++;

            }
        }
    }
}
