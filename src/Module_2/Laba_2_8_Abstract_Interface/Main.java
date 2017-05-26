package Module_2.Laba_2_8_Abstract_Interface;

import java.util.Arrays;
import java.util.Random;

/*Create two different Rectangle instances and compare it to each other. Print result to console.
* Add code to main() method in class Main_1 to create array (Rectangle[] arr2) of six Rectangle objects
* and sort it using Arrays.sort() method. Add code to main() method in class Main_1
* to iterate over Rectangles array in loop (use for-each loop) and invoke draw() method.
* Execute the program, output must looks like:
* This is Rectangle, color: RED, width=10, height=10, area is: 100
* This is Rectangle, color: RED, width=11, height=22, area is: 242
* This is Rectangle, color: RED, width=100, height=5, area is: 500
* Create an array of different shapes (size 10) and sorted in lexicographical order by color name.
 Print result to console.*/

public class Main {
     static double sumArea=0, sumRectArea=0, sumTriangleArea=0, sumCircleArea=0;
     static Random random = new Random();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        setArrayRandomShapes(shapes);
        Arrays.sort(shapes);
        printArrayShapes(shapes);
        Arrays.sort(shapes, new ShapesComparator());
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
            shape.draw();
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
