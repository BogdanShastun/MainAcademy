package Module_2.Laba_2_13_ENUMS;
/*1) Create a class Main with a main().
  Create a enum type MyDayOfWeek which specify a days-of-the-week (SUNDAY, MONDAY, …).
  Add to method main() code that iterate over MyDayOfWeek enum possible values in loop
  and print each value name to console.
  2) Add to method main() code that iterate over MyDayOfWeek enum possible values in loop
  and using switch statement print to console days of the week only when you have classes in Java Programming.
  3) Rewrite MyDayOfWeek enum, add method nextDay() which return the next day of week on for given enum value.
  For example: MyDayOfWeek.FRIDAY.nextDay() must return MyDayOfWeek.SATURDAY.
  Add to method main() code that read string value from console (using System.in and Scanner),
  then you must parse string value to particular enum value (using valueOf() method)
  and then print the name of next day of week to console.sbvnb*/

import java.util.Scanner;

public class Main {
   public enum  MyDayOfWeek{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
       public MyDayOfWeek nextDay() {
           if (ordinal() == values().length - 1) return values()[0];
           return values()[ordinal() + 1];
       }
   }

    public static void main(String[] args) {
       printDayOfWeek();                    //Lab_2_13_1
       printDaysOfWeekHaveClasses();        //Lab_2_13_2
       printNextDay();                      //Lab_2_13_3

    }

    public static void printDayOfWeek(){
        for (MyDayOfWeek day : MyDayOfWeek.values()) {
            System.out.println(day);
        }
    }

    public static void printDaysOfWeekHaveClasses(){
        for (MyDayOfWeek day : MyDayOfWeek.values()) {
            switch (day){
                case TUESDAY: System.out.println("My Java day: "+day); break;
                case THURSDAY: System.out.println("My Java day: "+day); break;
            }
        }
    }

    public static void printNextDay(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day: ");
        try {
            System.out.println("The next day of week: "+MyDayOfWeek.valueOf(scanner.next().toUpperCase()).nextDay());
        }catch (IllegalArgumentException e) {
            System.out.println("Not correct value!!!");
        }
    }
}
