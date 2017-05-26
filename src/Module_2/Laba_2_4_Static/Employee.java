package Module_2.Laba_2_4_Static;

/**
 * Created by Serg_Smile on 08.04.2017.
 */
/*1) Create Employee class with fields firstName, lastName, occupation, telephone and static field numberOfEmployees and getters/setters.
  2) Class must have constructor, which will initialize class fields and increment numberOfEmployees.
  3) Create multiple instances of Employee class in Main and the output numberOfEmployees field to the console.*/
public class Employee {
    private String firstName, lastName, occupation, telephone;
    private static int numberOfEmployees=0;

    public Employee(String firstName, String lastName, String occupation, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
        numberOfEmployees++;
    }

    public static void printEmploees(){
        System.out.println("Employees: "+Employee.numberOfEmployees+"\n");
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
    }
}
