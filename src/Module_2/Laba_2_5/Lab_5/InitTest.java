package Module_2.Laba_2_5.Lab_5;

import java.util.Random;

/**
 * Created by Serg_Smile on 09.04.2017.
 */

public class InitTest {
    static private int nextId;
    private int id;

    static {
        nextId = new Random().nextInt(1000);
    }

    InitTest(){
        id = nextId++;
    }

    public int getId() {
        return id;
    }
}

