public class ThinShapeDecorator extends Decorator{

    public ThinShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setThinBorder(decoratedShape);
    }

    private void setThinBorder(Shape decoratedShape){
        System.out.println("Border line: Thin");
    }
}