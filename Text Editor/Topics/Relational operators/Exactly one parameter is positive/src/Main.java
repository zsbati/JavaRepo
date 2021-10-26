import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int count = 0;
        int first = scanner.nextInt();
        if (first > 0) {
            count++;
        }
        int second = scanner.nextInt();
        if (second > 0) {
            count++;
        }
        int third = scanner.nextInt();
        if (third > 0) {
            count++;
        }
        if (count == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}