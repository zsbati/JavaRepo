package Practice;

import java.util.Scanner;

public class StringReadIn {

    public static String change(String str) {
        // write your code here
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a') {
                out.append(str.charAt(i));
            } else {
                out.append('b');
            }
        }
        return out.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(change(str));
    }

}

