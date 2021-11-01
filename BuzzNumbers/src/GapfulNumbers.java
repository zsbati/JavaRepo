import java.util.Scanner;

public class GapfulNumbers {

    public static boolean even(long n) {
        return (n % 2 == 0) ;
    }

    public static boolean divisible7(long n) {
        return n % 7 == 0;
    }

    public static boolean ends7(long n) {
        String s = Long.toString(n);
        return s.charAt(s.length() - 1) == '7';
    }

    public static boolean buzz(long n) {
        return ends7(n) || divisible7(n);
    }

    public static boolean duck(long n) {
        String s = String.valueOf(n);
        return s.indexOf('0') != -1;

    }

    public static boolean palindromic(long n) {
        String str = String.valueOf(n);
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        return str.equals(reverse);
    }

    public static boolean gapful(long n) {
        String str = String.valueOf(n);
        if (str.length() < 3) {
            return false;
        }
        String div = String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(str.length() - 1));
        long divisor = Long.parseLong(div);
        return n % divisor == 0;
    }

    public static void examine(long n) {
        System.out.println("");
        System.out.printf("Properties of %d\n", n);
        System.out.println("even: " + String.valueOf(even(n)));
        System.out.println("odd: " + String.valueOf(!even(n)));
        System.out.println("buzz: " + String.valueOf(buzz(n)));
        System.out.println("duck: " + String.valueOf(duck(n)));
        System.out.println("palindromic: " + String.valueOf(palindromic(n)));
        System.out.println("gapful: " + String.valueOf(gapful(n)));
        System.out.println("");
    }

    public static void instructions() {
        System.out.println("");
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("  * the first parameter represents a starting number;");
        System.out.println("  * the second parameter shows how many consecutive numbers are to be printed;");
        System.out.println("- separate the parameters with one space;");
        System.out.println("- enter 0 to exit.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Amazing Numbers!");
        instructions();

        Long number;
        while (true) {
            System.out.println("");
            System.out.print("Enter a request:");
            String request = sc.nextLine();
            if (request.equals("")) {
                instructions();
                continue;
            }
            String[] input = request.split(" ");
            if (input.length == 1) {
                try {
                    number = Long.valueOf(input[0]);
                } catch (NumberFormatException e) {
                    System.out.println("The first parameter should be a natural number or zero.");
                    continue;
                }

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

            if (input.length > 1) {
                long start;
                try {
                    start = Long.parseLong(input[0]);
                    if (start < 0) {
                        System.out.println("The first parameter should be a natural number or zero.");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("The first parameter should be a natural number or zero.");
                    continue;
                }
                long range;
                try {
                    range = Long.parseLong(input[1]);
                    if (range < 0) {
                        System.out.println("second parameter should be a natural number");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("second parameter should be a natural number");
                    continue;
                }
                String printout = "";
                System.out.println("");
                for (long i = start; i < start + range; i++) {
                    printout = i + " is ";
                    if (even(i)) {
                        printout += "even";
                    } else {
                        printout += "odd";
                    }

                    if (buzz(i)) {
                        printout += ", buzz";
                    }
                    if (duck(i)) {
                        printout += ", duck";
                    }
                    if (palindromic(i)) {
                        printout += ", palindromic";
                    }
                    if (gapful(i)) {
                        printout += ", gapful";
                    }
                    System.out.println(printout);
                }
                System.out.println("");
            }
        }
    }
}
