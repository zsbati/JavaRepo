//put imports you need here

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] name = new String[3];
        for (int i = 0; i < 3; i++) {
            name[i] = scanner.nextLine();
        }
        String out = "The form for " + name[0];
        out = out + " is completed. We will contact you if we need a chef who cooks " + name[2] + " dishes and has " + name[1] + " years of experience.";
        System.out.println(out);
    }
}