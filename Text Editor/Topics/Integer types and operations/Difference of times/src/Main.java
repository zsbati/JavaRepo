import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // first day
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();
        int time1 = seconds + 60 * minutes + 3600 * hours;
        hours = scanner.nextInt();
        minutes = scanner.nextInt();
        seconds = scanner.nextInt();
        int time2 = seconds + 60 * minutes + 3600 * hours;
        int time = time2 - time1;
        System.out.println(time);
    }
}