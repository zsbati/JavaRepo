import java.util.LinkedList;
import java.util.Scanner;

public class SpyNumbers {

    public static boolean even(long n) {
        return (n % 2 == 0);
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
        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            reverse.insert(0, str.charAt(i));
        }
        return str.equals(reverse.toString());
    }

    public static boolean gapful(long n) {
        String str = String.valueOf(n);
        if (str.length() < 3) {
            return false;
        }
        String div = str.charAt(0) + String.valueOf(str.charAt(str.length() - 1));
        long divisor = Long.parseLong(div);
        return n % divisor == 0;
    }

    public static boolean spy(long n) {
        String str = String.valueOf(n);
        long sum = 0;
        long product = 1;
        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
            product *= Character.getNumericValue(str.charAt(i));
        }
        return sum == product;
    }

    public static void examine(long n) {
        System.out.println();
        System.out.printf("Properties of %d\n", n);
        System.out.println("even: " + even(n));
        System.out.println("odd: " + !even(n));
        System.out.println("buzz: " + buzz(n));
        System.out.println("duck: " + duck(n));
        System.out.println("palindromic: " + palindromic(n));
        System.out.println("gapful: " + gapful(n));
        System.out.println("spy: " + spy(n));
        System.out.println();
    }

    public static void numberInOneLine(long n) {
        StringBuilder printout = new StringBuilder(n + " is ");
        if (even(n)) {
            printout.append("even");
        } else {
            printout.append("odd");
        }

        if (buzz(n)) {
            printout.append(", buzz");
        }
        if (duck(n)) {
            printout.append(", duck");
        }
        if (palindromic(n)) {
            printout.append(", palindromic");
        }
        if (gapful(n)) {
            printout.append(", gapful");
        }
        if (spy(n)) {
            printout.append(", spy");
        }
        System.out.println(printout);
    }

    public static void instructions() {
        System.out.println();
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("  * the first parameter represents a starting number;");
        System.out.println("  * the second parameter shows how many consecutive numbers are to be printed;");
        System.out.println("- two natural numbers and a property to search for;");
        System.out.println("- separate the parameters with one space;");
        System.out.println("- enter 0 to exit.");
    }

    public static void printRange(long start, long range) {
        System.out.println();
        for (long i = start; i < start + range; i++) {
            numberInOneLine(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<String> properties = new LinkedList<>();
        properties.add("BUZZ");
        properties.add("DUCK");
        properties.add("GAPFUL");
        properties.add("PALINDROMIC");
        properties.add("SPY");
        properties.add("EVEN");
        properties.add("ODD");

        String notInProperties = "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD]";

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Amazing Numbers!");
        instructions();

        long number;
        while (true) {
            System.out.println();
            System.out.print("Enter a request:");
            String request = sc.nextLine();
            if (request.equals("")) {
                instructions();
                continue;
            }
            String[] input = request.split(" ");
            if (input.length == 1) {
                try {
                    number = Long.parseLong(input[0]);
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

            if (input.length >= 2) {
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
                if (input.length == 2) {
                    printRange(start, range);
                }
                if (input.length >= 3) {
                    if (!properties.contains(input[2])) {
                        System.out.printf("The property [%s] is wrong.\n", input[2]);
                        System.out.println(notInProperties);
                    } else {
                        long count = range;
                        long n = start;
                        while (count > 0) {

                            if (input[2].equals("EVEN")) {
                                if (even(n)) {
                                    numberInOneLine(n);
                                    count--;
                                }
                                n++;
                            }
                            if (input[2].equals("ODD")) {
                                if (!even(n)) {
                                    numberInOneLine(n);
                                    count--;
                                }
                                n++;
                            }
                            if (input[2].equals("BUZZ")) {
                                if (buzz(n)) {
                                    numberInOneLine(n);
                                    count--;
                                }
                                n++;
                            }
                            if (input[2].equals("DUCK")) {
                                if (duck(n)) {
                                    numberInOneLine(n);
                                    count--;
                                }
                                n++;
                            }
                            if (input[2].equals("PALINDROMIC")) {
                                if (palindromic(n)) {
                                    numberInOneLine(n);
                                    count--;
                                }
                                n++;
                            }
                            if (input[2].equals("GAPFUL")) {
                                if (gapful(n)) {
                                    numberInOneLine(n);
                                    count--;
                                }
                                n++;
                            }
                            if (input[2].equals("SPY")) {
                                if (spy(n)) {
                                    numberInOneLine(n);
                                    count--;
                                }
                                n++;
                            }
                        }
                    }
                }
            }
        }
    }
}

