package Module_2.Laba_2_3_Constructors;

/**
 * Created by Serg_Smile on 07.04.2017.
 */
public class MyWindow {
    private double width, height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow() {
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public MyWindow(double width, double height) {
        this(width,height,2);
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width,height,numberOfGlass,"Black",true);
    }

    public void printFields(){
        System.out.printf("%2.2fx%2.2f %1d glass %s is open: %b",width,height,numberOfGlass,color,isOpen);
        System.out.println();
    }
}
