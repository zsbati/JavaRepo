import java.util.Scanner;

public class PalindromicNumbers {

    public static void examineEven(long n) {
        if (n % 2 == 0) {
            System.out.println("Even: true");
            System.out.println("Odd: false");
        } else {
            System.out.println("Even: false");
            System.out.println("Odd: true");
        }
    }

    public static boolean divisible7(long n) {
        return n % 7 == 0;
    }

    public static boolean ends7(long n) {
        String s = Long.toString(n);
        return s.charAt(s.length() - 1) == '7';
    }

    public static void buzz(long n) {
        if (ends7(n) || divisible7(n)) {
            System.out.println("buzz: true");
        } else {
            System.out.println("buzz: false");
        }
    }

    public static void duck(long n) {
        String s = String.valueOf(n);
        if (s.indexOf('0') != -1) {
            System.out.println("duck: true");
        } else {
            System.out.println("duck: false");
        }
    }

    public static void palindromic(long n) {
        String str = String.valueOf(n);
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        String palindromic = String.valueOf(str.equals(reverse));
        System.out.println("palindromic: "+palindromic);
    }

    public static void examine(long n) {
        System.out.printf("Properties of %d\n", n);
        examineEven(n);
        buzz(n);
        duck(n);
        palindromic(n);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("");
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter 0 to exit.");
        while (true) {
            System.out.println("");
            System.out.print("Enter a request:");
            long number = sc.nextLong();
            if (number == 0) {
                System.out.println(" ");
                System.out.println("Goodbye!");
                break;
            }

            if (number < 0) {
                System.out.println("The first parameter should be a natural number or zero.");
                continue;
            }

            examine(number);

        }

    }
}
