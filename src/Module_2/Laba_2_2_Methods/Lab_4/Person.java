package Module_2.Laba_2_2_Methods.Lab_4;

/**
 * Created by Serg_Smile on 07.04.2017.
 */
public class Person {
    private String firstName, lastName, gender;
    private int age, phoneNumber;

    public void setParametrs(String firstName) {
        this.firstName = firstName;
        System.out.println("Name: "+firstName);
    }

    public void setParameters(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Name: "+firstName+"\nLast Name: "+lastName);
    }

    public void setParametrs(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        System.out.println("Name: "+firstName+"\nLast Name: "+lastName+"\nAge: "+age);
    }

    public void setParametrs(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        System.out.println("Name: "+firstName+"\nLast Name: "+lastName+"\nAge: "+age+"\nGender: "+gender);
    }

    public void setParametrs(String firstName, String lastName, int age, String gender, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        System.out.println("Name: "+firstName+"\nLast Name: "+lastName+"\nAge: "+age+
                "\nGender: "+gender+"\nPhone Number: "+phoneNumber);
    }
}
