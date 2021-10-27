import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final String str = scanner.nextLine();
        final int number = Integer.parseInt(scanner.nextLine());

        Returner returner = new Ret() {

        }
                /* create an instance of an anonymous class here,
                               do not forget ; on the end;
                               variables str and number will be accessible during testing */

        System.out.println(returner.returnString());
        System.out.println(returner.returnInt());
    }

    private static class Ret implements Returner {
        @Override
        public String returnString() {
            return null;
        }

        @Override
        public int returnInt() {
            return 0;
        }
    }
}

interface Returner {

    public String returnString();

    public int returnInt();
}