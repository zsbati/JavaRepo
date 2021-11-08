package Practice;

import java.util.Scanner;

public class Reading4Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split("\s+");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
