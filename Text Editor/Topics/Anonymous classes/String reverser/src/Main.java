import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringReverser reverser = new StringReverser() {

            @Override
            public String reverse(String str) {
                String out = "";
                for (int i = 0; i < str.length(); i++) {
                    out = Character.toString(str.charAt(i)) + out;
                }
                return out;
            }
        };

        /* create an instance of an anonymous class here,
           do not forget ; on the end */

        System.out.println(reverser.reverse(line));
    }

    interface StringReverser {

        String reverse(String str);
    }

}