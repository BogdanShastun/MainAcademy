package Test.Lessons;

public class MyException extends Exception{
    public MyException(Throwable e) {
        initCause(e);
    }
}

