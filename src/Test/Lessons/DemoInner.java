package Test.Lessons;

abstract class Abst {
    abstract Abst mm();
}
class Outer {
    Abst mm() {
        class Inner extends Abst {
            Abst mm() {
                System.out.println("Inner ");
                return  new Inner();
            }
        }
        return  new Inner();
    }
}
public class DemoInner {
    public static void main(String [] a) {
        Outer obj = new Outer();
        Abst aa = obj.mm();
        aa.mm();
    }
}
