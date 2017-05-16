package Test.Fibonachi;

class Fibonachi{
    static long count=0, next=1, last=0, reserv, fin;

    public static void fibonachiAudit(long inputNumber){
        while (last < inputNumber){
            reserv = next;
            next += last;
            fin=last;
            last = reserv;
            count++;
        }
    }
}

