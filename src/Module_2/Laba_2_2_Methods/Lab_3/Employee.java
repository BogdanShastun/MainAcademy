package Module_2.Laba_2_2_Methods.Lab_3;

/**
 * Created by Serg_Smile on 07.04.2017.
 */
public class Employee {

    public void calcSalary(String name, double... salary) {
        double totalSalary=0;
        for (double x : salary) {
            totalSalary +=x;
        }
        System.out.println("Имя работника: "+name+"\nОбщая зарплата: "+totalSalary+" грн.");
    }
}
