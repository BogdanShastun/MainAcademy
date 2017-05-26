package Module_2.Laba_2_8_Abstract_Interface;

import java.util.Random;
/* You must implement the Comparable interface to each of shape types (Rectangle, Circle, Triangle).
Implement the compareTo() method for each of shape types class so that it compares the areas of the shapes.*/

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    public static Rectangle getRandomRectangle(){
        Random random = new Random();
        return new Rectangle(getRandomColor(), random.nextInt(9)+2, random.nextInt(9)+2);
    }

    @Override
    public double calcArea(){
        return width*height;
    }

    @Override
    public String toString(){
        return super.toString()+", width = "+(int)width+", height = "+(int)height;
    }
}
