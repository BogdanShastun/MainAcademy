package Module_2.Laba_2_8_Abstract_Interface;

import java.util.Random;
/* You must implement the Comparable interface to each of shape types (Rectangle, Circle, Triangle).
Implement the compareTo() method for each of shape types class so that it compares the areas of the shapes.*/

public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }
    public static Circle getRandomCircle(){
        Random random = new Random();
        return new Circle(getRandomColor(), random.nextInt(7)+2);
    }

    @Override
    public double calcArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString(){
        return super.toString()+", radius = "+(int)radius;
    }
}
