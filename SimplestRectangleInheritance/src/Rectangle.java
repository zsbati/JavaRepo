public class Rectangle {

    private double length;
    private double width;
    private double perimeter;
    private double area;

    public Rectangle(){

    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getPerimeter(){
      return 2*(length + width);
    }

    public double getArea() {
        return width*length;
    }


}
