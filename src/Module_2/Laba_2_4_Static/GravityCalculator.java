package Module_2.Laba_2_4_Static;

/**
 * Created by Serg_Smile on 09.04.2017.
 */
/*Write A program that computes the distance an object will fall in Earth's gravity.
Create A new class called GravityCalculator with method calcDist(double time) that takes double time,
and returns the position of an object after falling for time seconds (outputting the position in meters).
The formula in Math notation is: x(t) = 0.5 × A × time 2 + vi × time + xi
Where:
A - Acceleration (m/s2 ) = -9.81
t - Time (s) (for example t = 10)
vi - Initial velocity (m/s) = 0
xi - Initial position = 0
Declare acceleration value field as A constant;*/
public class GravityCalculator {
    private static double t, vi = 0, xi = 0;
    private static final double A = 9.81;

    public static double calcDist(double time) {
        double x = 0;
        t = time;
        if (time<0) return x;
        else  {
            x = 0.5* A *time*time+vi*time+xi;
            return x;
        }
    }

    public static void printDistance(double x){
        if (x>0) System.out.printf("Position of an object after falling for %.2f seconds %.2f meters \n\n", t, x);
            else System.out.printf("The parameter 'time'(%.2f) must be positive!!!\n", t);
    }
}
