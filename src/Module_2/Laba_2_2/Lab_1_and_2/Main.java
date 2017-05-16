package Module_2.Laba_2_2.Lab_1_and_2;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.filling();//     Заполняю массивы случайными числами.
        matrix.printArray(matrix.getArr1()); //  Проверяю заполнение
        matrix.printArray(matrix.getArr2()); //  массивов.
        matrix.printArray(matrix.sumArray(matrix.getArr1(),matrix.getArr2()));//  Вывожу результат сложения массивов.
        matrix.printArray(matrix.dubArray(matrix.getArr1(),matrix.getArr2()));//  Вывожу результат умножения массивов.
    }
}
