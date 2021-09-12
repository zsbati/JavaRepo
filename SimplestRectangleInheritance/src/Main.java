public class Main {

    public static void main(String[] args) {
        double length = 9.8;
        double width = 8.9;

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(length);
        rectangle.setWidth(width);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());

        Square square = new Square();
        square.setLength(length);
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
        }
    }


