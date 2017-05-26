package Test.Lessons;

public class MyOuter {
    private String x = "Outer";
    void doStuff() {
        class MyInner {
            MyInner mi = new MyInner();
            public void seeOuter() {
                System.out.println("Outer x is " + x);
            }
        }
    }
    public static void main(String[] args) {
        MyOuter myOuter = new MyOuter();
        myOuter.doStuff();
    }
}
