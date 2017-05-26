package Module_2.Laba_2_5_Initialization.Lab_2;

/**
 * Created by Serg_Smile on 09.04.2017.
 */
/*Create class InitTest with field arr of array of integers and non-static initialization block
  which will initialize that array with random values (Size of array is 10).
  To generate random numbers you can use next code: arr[i]= (int) (100 * Math.random()).
  (Or using Random class instance and nextInt() method invocation). Add to class InitTest and method printArray()
  which will print values of this array. Create class Main, which will create two instances of class InitTest
  and invoke method printArray() to print values of their arrays on console.
  Example of output:
  23,43,11,34,78,59,34,61,24,2
  5,48,50,3,1,4,67,62,78,98*/

public class MyInit {
    int[] arr = new int[10];

    {
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= (int) (100 * Math.random());
        }
    }

    public void printArray(){
        for (int x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

}

