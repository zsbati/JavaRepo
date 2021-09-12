public class ProtectedAbstractFactoryDemo {
    public static void main(String[] args) {

        AbstractFactory factory = ProtectedFactoryProducer.getFactory(true); //factoryProducer is instantiated only once

        //get a circle and draw it
        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

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

        factory = ProtectedFactoryProducer.getFactory(false);

        //get a circle and draw it
        Shape shape11 = factory.getShape("CIRCLE");
        shape11.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape12 = factory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape12.draw();

        //get an object of Square and call its draw method.
        Shape shape13 = factory.getShape("SQUARE");

        //call draw method of square
        shape13.draw();

        //get an object of Square and call its draw method.
        Shape shape14 = factory.getShape("ELLIPSE");

        //call draw method of ellipse
        shape14.draw();

        //get an object of Square and call its draw method.
        Shape shape15 = factory.getShape("TRIANGLE");

        //call draw method of triangle
        shape15.draw();


    }
}

