import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double first = (double) scanner.nextInt();
        double second = (double) scanner.nextInt();
        double third = (double) scanner.nextInt();
        int out = (int) ((int) Math.ceil(first / 2.0) + Math.ceil(second / 2.0) + Math.ceil(third / 2.0));
        System.out.println(out);
    }
}