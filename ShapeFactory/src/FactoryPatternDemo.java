public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory(); //factory is instantiated only once
        Shape shape;

        //get a circle and draw it
        shape = factory.getShape("CIRCLE");
        shape.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = factory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = factory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();

        //get an object of Square and call its draw method.
        Shape shape4 = factory.getShape("ELLIPSE");

        //call draw method of ellipse
        shape4.draw();

        //get an object of Square and call its draw method.
        Shape shape5 = factory.getShape("TRIANGLE");

        //call draw method of triangle
        shape5.draw();
    }
}
