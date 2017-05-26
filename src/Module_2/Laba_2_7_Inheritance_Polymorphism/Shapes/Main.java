package Module_2.Laba_2_7_Inheritance_Polymorphism.Shapes;
import java.util.Random;

/*Create class Main_1 with method main().
The program must demonstrate the creation of one Shape object and print it name and color to console.
Then add code to invoke calcArea() method and print result to console.
Program output must looks like:
“This is Shape, color is: RED”
“Shape area is: 0”
Use MyShapes project. The program must demonstrate the creation of an array of different types of shapes
and print characteristics of each shape on console.
1. Add new code to method main() in class Main_1:
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
     static double sumArea=0, sumRectArea=0, sumTriangleArea=0, sumCircleArea=0;
     static Random random = new Random();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[random.nextInt(10)+3];
        setArrayRandomShapes(shapes);
        printArrayShapes(shapes);
        calcTotalArea(shapes);
        printTotalArea();
    }

    public static void setArrayRandomShapes(Shape[] shapes){
        int a;
        for (int i=0; i<shapes.length; i++) {
            a = random.nextInt(3);
            switch (a){
                case 0: shapes[i] = Triangle.getRandomTriangle(); break;
                case 1: shapes[i] = Rectangle.getRandomRectangle(); break;
                case 2: shapes[i] = Circle.getRandomCircle(); break;
            }
        }
    }

    public static void printArrayShapes(Shape[] shapes){
        for (Shape shape : shapes) {
            System.out.print(shape);
            System.out.printf(", area is: %.2f\n",shape.calcArea());
        }
    }

    public static void calcTotalArea(Shape[] shapes){
        double area;
        for (int i = 0; i < shapes.length; i++){
            area = shapes[i].calcArea();
            sumArea+=area;
            if (shapes[i] instanceof Rectangle) sumRectArea+=area;
            if (shapes[i] instanceof Triangle) sumTriangleArea+=area;
            if (shapes[i] instanceof Circle) sumCircleArea+=area;
        }
    }

    public static void printTotalArea(){
        System.out.printf("Rectangles total area: %.2f\n", sumRectArea);
        System.out.printf("Circle total area: %.3f\n", sumCircleArea);
        System.out.printf("Triangle total area: %.2f\n", sumTriangleArea);
        System.out.printf("Total area of all shape types = %.2f\n", sumArea);
    }
}
