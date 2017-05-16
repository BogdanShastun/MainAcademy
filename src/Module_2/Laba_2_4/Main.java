package Module_2.Laba_2_4;

/**
 * Created by Serg_Smile on 08.04.2017.
 */

public class Main {

    public static void main(String[] args) {
        int [] arr1 = Calculation.fillingArray(15);                                         //Result Lab 2.4.2
        Calculation.printArray(arr1);
        Calculation.printMax(MyMath.findMax(arr1));
        Calculation.printMin(MyMath.findMin(arr1));
        int [] arr2 = Calculation.fillingArray(0);
        Calculation.printArray(arr2);
        Calculation.printMax(MyMath.findMax(arr2));
        Calculation.printMin(MyMath.findMin(arr2));

        MyMath.printAreaOfCircle(MyMath.areaOfCircle(23.345));                              //Result Lab 2.4.3
        MyMath.printAreaOfCircle(MyMath.areaOfCircle(0));

        Employee employee1 =                                                                       //Result Lab 2.4.4
                new Employee("Vasya", "Petkin", "Menedger", "+380673552332");
        Employee employee2 =
                new Employee("Kolya", "Vasyutin", "Teacher", "+380634758585");
        Employee.printEmploees();

        MyCalc.printPi(MyCalc.calcPi(4));                                                       //Result Lab 2.4.5
        MyCalc.printPi(MyCalc.calcPi(0));

        MyPyramide.printPyramide(0);                                                            //Result Lab 2.4.6
        MyPyramide.printPyramide(10);
        MyPyramide.printPyramide(9);

        GravityCalculator.printDistance(GravityCalculator.calcDist(-2));                      //Result Lab 2.4.7
        GravityCalculator.printDistance(GravityCalculator.calcDist(4.567));
    }
}
