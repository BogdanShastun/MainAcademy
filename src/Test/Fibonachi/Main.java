package Test.Fibonachi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        long number = scan.nextLong();
        if (number < 1) System.out.println("Введенное число меньше либо ровно нулю!!! Попробуйте еще раз...");
        if (number == 1) System.out.println("Введенное число ровно и 1 и 2 елементу последовательности Фибоначи.");
        if (number > 1) Fibonachi.fibonachiAudit(number);
        if (Fibonachi.last==number) System.out.println("Введенное число соответствует "+Fibonachi.count +" елементу последовательности Фибоначи.");
        if (Fibonachi.last>number) System.out.println("Введенное число не ровно числу Фибоначи!!!\n"+
        "И находится между: " + Fibonachi.fin + "(" + (Fibonachi.count - 1) + " ел.)  |" + number + "|  " + Fibonachi.last + "(" + Fibonachi.count + " ел.)");
    }
}