import java.util.Scanner;

public class DuckNumbers {

    public static void examineEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Even: true");
            System.out.println("Odd: false");
        } else {
            System.out.println("Even: false");
            System.out.println("Odd: true");
        }
    }

    public static boolean divisible7(int n) {
        return n % 7 == 0;
    }

    public static boolean ends7(int n) {
        String s = Integer.toString(n);
        return s.charAt(s.length() - 1) == '7';
    }

    public static void buzz(int n) {
        if (ends7(n) || divisible7(n)) {
            System.out.println("buzz: true");
        } else {
            System.out.println("buzz: false");
        }
    }

    public static void duck(int n) {
        String s = String.valueOf(n);
        if (s.indexOf('0') != -1) {
            System.out.println("duck: true");
        } else {
            System.out.println("duck: false");
        }
    }

    public static void examine(int n) {
        System.out.printf("Properties of %d\n", n);
        examineEven(n);
        buzz(n);
        duck(n);
    }

    public static void main(String[] args) {
//        write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int number = sc.nextInt();
        if (number > 0) {
            examine(number);
        } else {
            System.out.println("This number is not natural!");
        }

    }
}
