package Module_2.Laba_2_7.Shapes;
/**
 * Created by Serg_Smile on 14.05.2017.
 */
/* Add to project MyShapes a new class Rectangle which is a subclass of Shape.
Add to class Rectangle a private field’s width and height (of double type).
In class Rectangle override calcArea() method which must return area of rectangle (By the formula: area = width* height).
In class Rectangle override the toString() method.
It must return string which contain name of shape, color and rectangle width and height.
Example: “This is Rectangle, color: RED, width=11, height=22”
Add to class Rectangle constructor with color, width and height arguments.*/
public class Rectangle extends Shape{
    private double width, height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
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
