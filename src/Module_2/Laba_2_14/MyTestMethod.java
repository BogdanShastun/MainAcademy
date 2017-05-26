package Module_2.Laba_2_14;

/*1) Create class MyTestMethod with generic static method calcNum (with two parameters:
an array T[] and variable maxElem of type T) that counts the number of elements in an array T[]
that are greater than a specified element maxElem.*/
public class MyTestMethod {

    static <T extends Number> int calcNum(T[] array,T maxElem){
        int cout = 0;
        /*for (T element : array) {
            if (element > (int)maxElem) cout++;
        }*/
        return cout;
    }
}
