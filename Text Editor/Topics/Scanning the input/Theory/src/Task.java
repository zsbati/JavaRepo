// You can experiment here, it won’t be checked

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] name = new String[3];
        for (int i = 0; i < 3; i++) {
            name[i] = scanner.nextLine();
        }
        for (int i = 2; i >= 0; i--) {
            System.out.println(name[i]);
        }
    }
}
