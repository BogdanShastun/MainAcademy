package Module_1.Laba_1_4;

/**
 * Created by Serg_Smile on 12.03.2017.
 */
public class Laba_1_4_4 {
    public static void main (String [] args){
        int i = 10, c = 10;
        c = ++i;
        System.out.println("Після 'c=++i' i= "+i+", f c = "+c);
        c = i++;
        System.out.println("Після 'c=i++' i= "+i+", f c = "+c);
        c = --i;
        System.out.println("Після 'c=--i' i= "+i+", f c = "+c);
        c = i--;
        System.out.println("Після 'c=i--' i= "+i+", f c = "+c);
    }
}
