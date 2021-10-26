import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] a = new int[4];
        String printout = "";
        for (int i = 0; i < 4; i++) {
            a[i] = scanner.nextInt();
            a[i]--;
            printout = printout + " "+ Integer.toString(a[i]);
        }
        System.out.println(printout.strip());
    }
}
