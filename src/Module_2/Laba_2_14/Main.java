package Module_2.Laba_2_14;

import java.util.Random;

/*1) Create a class Main with a main() method. Add to method main() code that creates two objects of MyTuple.
The first must be parameterized with next types: String, Integer, Long.
The second must be parameterized with next types: Double, String, String.
2) Add to method main() code that creates two array, first – array of Integer type and second – array of Double type.
Fill these arrays with some random values. Add code to counts the number of elements in each of arrays
that are greater than a specified element by invoking calcNum() static method.*/
public class Main {
    public static void main(String[] args) {
        MyTuple <String,  Integer, Long> obj1 = new MyTuple<>  ("s1",21,21l);       // Lab_2_14_1
        MyTuple <Double, String, String> obj2 = new MyTuple<>(23d, "wre", "sdjfh");
        Random random = new Random();


    }
}
