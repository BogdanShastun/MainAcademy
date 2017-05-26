package Module_2.Laba_2_7_Inheritance_Polymorphism.Shapes;

import java.util.Random;

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
    static Random random = new Random();

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public static String getRandomColor(){
        String[] color = {"WHITE","BLACK","BLUE","YELLOW","RED","GREEN","GRAY"};
        return color[random.nextInt(7)];
    }

    @Override
    public String toString(){
        return "This is "+this.getClass().getSimpleName()+", color is: "+shapeColor;
    }

    public abstract double calcArea();
}
