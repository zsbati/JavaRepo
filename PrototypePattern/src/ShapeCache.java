//import java.util.HashMap;
import java.util.Hashtable;

/**  HashMap is non synchronized. It is not-thread safe and can't be shared between
many threads without proper synchronization code whereas Hashtable is synchronized. ...
HashMap allows one null key and multiple null values whereas Hashtable doesn't allow
any null key or value.
 */

public class ShapeCache {
    //private static HashMap<String, Shape> shapeMap  = new HashMap<String, Shape>();
    private static Hashtable<String, Shape> shapeMap  = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone(); //that's the essence!
    }

    /** for each shape run database query and create shape
     shapeMap.put(shapeKey, shape);
     for example, we are adding five shapes */

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);

        Ellipse ellipse = new Ellipse();
        ellipse.setId("4");
        shapeMap.put(ellipse.getId(), ellipse);

        Triangle triangle = new Triangle();
        triangle.setId("5");
        shapeMap.put(triangle.getId(), triangle);

    }

}
