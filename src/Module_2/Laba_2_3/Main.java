package Module_2.Laba_2_3;

public class Main {
    public static void main(String[] args) {
        MyWindow [] windows = new MyWindow[5];
        windows[0]= new MyWindow(10.25,20.85,1,"Yellow", false);
        windows[1] = new MyWindow(20.15,40.20,2,"Green", true);
        windows[2] = new MyWindow(30.45,20.45,2,"Blue", true);
        windows[3] = new MyWindow(40.65,40.75,4,"Red", false);
        windows[4] = new MyWindow(50.35,50.90,2,"White", true);
        for (MyWindow window : windows) window.printFields();

        MyWindow windowWithOutParameters = new MyWindow();
        windowWithOutParameters.printFields();

        MyWindow windowWithTwoParametrs = new MyWindow(22.35,15.50);
        windowWithTwoParametrs.printFields();

        MyWindow windowWithThreeParametrs = new MyWindow(35.15, 55.65, 4);
        windowWithThreeParametrs.printFields();
    }
}
