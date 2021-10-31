import java.util.Scanner;
//package numbers;
public class BuzzNumbers {
    public static void examine(int n) {
        if (n % 2 == 0) {
            System.out.println("This number is Even.");
        } else {
            System.out.println("This number is Odd.");
        }
        boolean divisible = n % 7 == 0;
        String s = Integer.toString(n);
        boolean ends7 = s.charAt(s.length()-1) == '7';

        if (divisible || ends7) {
            System.out.println("It is a buzz number.");
            System.out.println("Explanation:");
            if (divisible && !ends7){
                System.out.printf("%d is divisible by 7.", n);
            } else if (!divisible && ends7) {
                System.out.printf("%d ends with 7.", n);
            } else {
                System.out.printf("%d is divisible by 7 and ends with 7.", n);
            }
        } else {
            System.out.println("It is not a buzz number.");
            System.out.println("Explanation:");
            System.out.printf("%d is neither divisible by 7 nor does it end with 7.",n);
        }
    }
    public static void main(String[] args) {
//        write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int number = sc.nextInt();
        if (number > 0){
            examine(number);
        } else {
            System.out.println("This number is not natural!");
        }
        //System.out.println(number);
    }
}
