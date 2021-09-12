public class Square extends Rectangle{
    @Override
    public void draw() {
        super.draw();
        System.out.println("This rectangle is special: it's a SQUARE, all sides are equal.");
    }
}
