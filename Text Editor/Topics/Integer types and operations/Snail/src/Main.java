import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int height = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int place = 0;
        int days = 0;
        while (place < height) {
            place += up;
            days++;
            if (place >= height) {
                break;
            } else {
                place -= down;
            }
        }
        System.out.println(days);
    }
}