package Test.Lessons;


public class Main {

    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j<6)System.out.print("j = "+j);
                else return;
            }
        }
        System.out.println("kj");
    }
}
