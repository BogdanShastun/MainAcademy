package Module_2.Laba_2_4_Static;

/**
 * Created by Serg_Smile on 08.04.2017.
 */
/*Create class MyMath with two static methods (findMin and findMax), which will take array of int values as argument
  and return minimum element value (for findMin method) or maximum element value (for findMax method).
  Add to class MyMath final static field PI = 3.14 and static method areaOfCircle(),
  which will take radius, use constant PI and calculate area.*/

class MyMath {
    private final static double PI = 3.141592653589793238462643383;

    static int findMax(int[] mas){
        if (mas!=null) {
            int max = mas[0];
            for (int x : mas) if (max < x) max = x;
            return max;
        }
        else{
            System.out.println("Array does not exist! Unable to find the max element!!!");
            return 0;
        }
    }

    static int findMin(int[] mas){
        if (mas!=null) {
            int min = mas[0];
            for (int x:mas) if (min>x) min=x;
            return min;
        }
        else{
            System.out.println("Array does not exist! Unable to find the min element!!! \n");
            return 0;
        }
    }

    static double areaOfCircle(double radius){
        if (radius>0) return PI*radius*radius;
        else {
            System.out.println("Value radius of the circle is not correct!!! \n");
            return 0;
        }
    }

    static void printAreaOfCircle(double areaOfCircle){
        if (areaOfCircle>0) System.out.printf("Radius circle: %.2f \n\n", areaOfCircle);
    }
}
