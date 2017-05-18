package Module_2.Laba_2_8;

import java.util.Comparator;
import java.util.Random;

/*Rewrite the class Shape to make it abstract and change calcArea() method declaration to make it abstract too.
 Implement interface Drawable to class Shape. The classes that implements the Drawable interface will provide actual
 implementation to these abstract method witch print characteristics of each shape on console
 (print to console information about this object from toString() and area of this shape (using calcArea() method).
 * */

public abstract class Shape implements Drawable, Comparable {
    private String shapeColor;
    static Random random = new Random();

    public String getShapeColor() {
        return shapeColor;
    }

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

    public void draw(){
        System.out.print(this);
        System.out.printf(", area is: %.2f\n",this.calcArea());
    }

    public int compareTo(Object obj){
        Shape shape = (Shape)obj;
        if (this.calcArea() > shape.calcArea()) return 1;
        if (this.calcArea() < shape.calcArea()) return -1;
        return 0;
    }


}
