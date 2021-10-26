import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String str = scanner.next();
        char[] lst = str.toCharArray();
        String out = "";
        for (char c : lst) {
            out = c + out;
        }
        System.out.println(Integer.parseInt(out));
    }
}