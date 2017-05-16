package Module_2.Laba_2_7.Shapes;

import java.util.Random;

/**
 * Created by Serg_Smile on 29.04.2017.
 */
/*You should design a super class Shape, which defines the public method of all the shapes called calcArea(),
which returns the area (double type) of that particular shape. (Our program uses many kinds of shapes,
such as triangle, rectangle and so on.) Define a Shape class as:
public class Shape {
// declare private instance variable shapeColor of String type
// create a constructor for Shape with shapeColor parameter
// Override toString() to return the string of Shape name and color, example: “Shape, color is: RED”
// All shapes must has a method called calcArea(), write public method (empty) calcArea() that returns double value ( 0.0 ) . }*/
public abstract class Shape {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }
    public static String getRandomColor(){
        String[] color = {"WHITE","BLACK","BLUE","YELLOW","RED","GREEN","GRAY"};
        Random random = new Random();
        return color[random.nextInt(6)];
    }
    @Override
    public String toString(){
        return "This is "+this.getClass().getSimpleName()+", color is: "+shapeColor;
    }
    public abstract double calcArea();
    public void printArea(){
        System.out.println("Shape area is: "+(int)this.calcArea());
    }
    public static Shape[] createShapes(){
        Shape[] myShapes = {
                new Rectangle("RED",3,4), new Rectangle("BLUE",5,6),
                new Rectangle("YELLOW",10,3), new Rectangle("WHITE",7,2),
                new Rectangle("GRAY",2,7), new Circle("BLUE",7),
                new Circle("GREEN",6), new Triangle("BLACK",4,3,7),
                new Triangle("RED",8,5,9)};
        return myShapes;
    }
}
