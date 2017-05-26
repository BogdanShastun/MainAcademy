package Module_2.Laba_2_9_String;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

/*Create a class Main_1 with a main() method. In method main() declare local variable myStr of String type
and assign a value: “abracadabra”. Using the methods of the class String, do next steps:
        * Find the index of first “ra” substring of myStr value and print result to console.
        * Find the index of last “ra” substring of myStr value and print result to console.
        * Get substring of myStr from 3 to 7 char index and print result to console.
        * Create static method reverseString(String) which return String value as result with changed order
          of letters (reverse it, for example “abcd” ->”dcba”).
        * Invoke reverseString() method with myStr argument and print result to console.*/
public class Main_1 {

    @NotNull
    public static String reverseString(String str) throws NullPointerException{
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String myStr = scanner.next();
        if (myStr.indexOf("ra") > 0) {
            System.out.println("Index of first “ra” = " + myStr.indexOf("ra"));
            System.out.println("Index of last “ra” = " + myStr.lastIndexOf("ra"));
        } else System.out.println("Введенная строка не имет в себе подстроки 'ra'.");
        try {
            System.out.println("Substring of myStr from 3 to 7 char index = " + myStr.substring(3, 7));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Введенная строка имеет длину менее 7 символов!!!");
        }
        System.out.println("Reverse string: " + reverseString(myStr));
    }
}
