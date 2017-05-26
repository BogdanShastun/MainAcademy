package Module_2.Laba_2_8_Abstract_Interface;

import java.util.Random;

/* You must implement the Comparable interface to each of shape types (Rectangle, Circle, Triangle).
Implement the compareTo() method for each of shape types class so that it compares the areas of the shapes.*/

public class Triangle extends Shape {
    private double a,b,c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triangle getRandomTriangle(){
        Random random = new Random();
        int a = random.nextInt(9)+3, b = random.nextInt(9)+3;
        return new Triangle(getRandomColor(), a, b, Math.sqrt(a*a+b*b));
    }

    @Override
    public double calcArea(){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public String toString(){
        return super.toString()+", a = "+(int)a+", b = "+(int)b+", c = "+(int)c;
    }
}
