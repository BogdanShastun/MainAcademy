package Module_2.Laba_2_7.Shapes;

import java.util.Random;

/**
 * Created by Serg_Smile on 29.04.2017.
 */
/*Create class Main with method main().
The program must demonstrate the creation of one Shape object and print it name and color to console.
Then add code to invoke calcArea() method and print result to console.
Program output must looks like:
“This is Shape, color is: RED”
“Shape area is: 0”
Use MyShapes project. The program must demonstrate the creation of an array of different types of shapes
and print characteristics of each shape on console.
1. Add new code to method main() in class Main:
2. Create array (Shape[] arr) of different Shape objects, (five rectangles, two circles and two triangles);
3. Add code to iterate over shapes array in loop (use for-each loop) and print characteristics of each shape on
console (using toString() method) with area of this shape (using calcArea() method).
4. Execute the program, output must looks like:
This is Rectangle, color: RED, width=11, height=22, area is: 242
This is Triangle, color: BLACK, a=5, b=5, c=5, area is: 10.825
This is Circle, color: GREEN, radius=10, area is: 314.15926 …
5. Add code to calculate total area of all shape types. Define sumArea (of double type) local variable
and use it in loop to sum total area for all shapes.
6. Add code to sum total area for each shape types.
Define sumRectArea, sumTriangleArea, sumCircleArea (of double type) local variables
and use it in loop to sum total area for each shape type. You should use instanceof keyword for determining,
total area for each of shape types (Rectangle, Circle, Triangle) and print it to console.
7. Execute the program, output must looks like:
Rectangles total area: 234.54
Circle total area: 547.231
Triangle total area: 356.56*/
public class Main {
     static double sumArea=0;
     static double sumRectArea=0, sumTriangleArea=0, sumCircleArea=0;
    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapes = new Shape[10];
        for (Shape shape : shapes) {

            System.out.println(shape);
            shape.printArea();
            double area = shape.calcArea();
            sumArea+=area;
            if (shape instanceof Rectangle) sumRectArea+=area;
            if (shape instanceof Triangle) sumTriangleArea+=area;
            if (shape instanceof Circle) sumCircleArea+=area;
        }
        Shape fff = Triangle.getRandomTriangle();
        System.out.println(fff);
        System.out.println("Rectangles total area: "+(int)sumRectArea);
        System.out.println("Circle total area: "+(int)sumCircleArea);
        System.out.println("Triangle total area: "+(int)sumTriangleArea);

        System.out.println("Total area of all shape types = "+(int)sumArea);

    }
}
