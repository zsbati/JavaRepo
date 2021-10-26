import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int max = Math.max(second, third);
        int min = Math.min(second, third);
        boolean out = max >= first && min <= first;
        System.out.println(out);
    }
}