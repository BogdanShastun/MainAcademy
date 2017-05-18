package Module_2.Laba_2_8;

import java.util.Comparator;

/**
 * You must implement the Comparator interface to each of shape types (Rectangle, Circle, Triangle).
 Implement the compare(…) method for each of shape types class so that it compares the color of the shapes.
 */
public class ShapesComparator implements Comparator {
    public int compare(Object o1, Object o2){
        Shape shape1 = (Shape)o1;
        Shape shape2 = (Shape)o2;
        if (shape1.getShapeColor().charAt(0) > shape2.getShapeColor().charAt(0)) return 1;
        if (shape1.getShapeColor().charAt(0) < shape2.getShapeColor().charAt(0)) return -1;
        return 0;
    }
}
