import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // put your code here
        double area;
        Scanner sc = new Scanner(System.in);
        String shape = sc.next();
        switch (shape) {
            case "circle":
                double radius = sc.nextDouble();
                area = 3.14 * radius * radius;
                break;
            case "rectangle":
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                area = length * width;
                break;
            case "triangle":
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                double p = (a + b + c) / 2;
                area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                break;
            default:
                area = -1.0d;
        }
        if (area < 0){
            System.out.println("Impossible, try again.");
        } else {
            System.out.println(area);
        }
    }
}