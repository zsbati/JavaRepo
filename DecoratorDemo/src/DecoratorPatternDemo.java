public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape shape = new GreenShapeDecorator( new ThinShapeDecorator( new Triangle()));
        shape.draw();
        shape = new RedShapeDecorator( new ThickShapeDecorator( new Square()));
        shape.draw();
        shape = new BlueShapeDecorator( new ThinShapeDecorator( new Circle()));
        shape.draw();
    }

}
