package Test.Lessons;

public class NewClass{
    public enum PrinterType {
        DOT,
        INT,
        COM
    }

    public static void main(String[] args) {
        for (PrinterType p :
                PrinterType.values()) {

        }
        PrinterType[] p2 = PrinterType.values();
        System.out.println(p2[2]);
    }
}
