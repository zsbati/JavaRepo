import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toLowerCase();
        if (word.charAt(0) == 'j') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}