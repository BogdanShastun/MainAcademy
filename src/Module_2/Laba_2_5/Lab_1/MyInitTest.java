package Module_2.Laba_2_5.Lab_1;

/**
 * Created by Serg_Smile on 09.04.2017.
 */
/*Create class MyInitTest with two initialization blocks, two static initialization blocks and
  two constructors (one constructor() must invoke second constructor(int)).
  On each block write code that prints on console type of block and block number.
  For example:
  “static initialization block 1”
  “static initialization block 2”
  “non-static initialization block 1”
  “non-static initialization block 2”
  “constructor 1” “constructor 2”
  Create class Main, which will create instance of class MyInitTest by invoking first constructor.*/

public class MyInitTest {
    int variable;

    static {
        System.out.println("static initialization block 1");
    }

    {
        System.out.println("non-static initialization block 1");
    }

    static {
        System.out.println("static initialization block 2");
    }

    {
        System.out.println("non-static initialization block 2");
    }

    public MyInitTest(){
        this(2);
        System.out.println("constructor 1");
    }

    MyInitTest(int variable){
        this.variable = variable;
        System.out.println("constructor 2");
    }

}
