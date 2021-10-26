//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int people = 8;
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[people];
        for (int i = 0; i < people; i++) {
            words[i] = scanner.next();
        }
        for (int i = people - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}
