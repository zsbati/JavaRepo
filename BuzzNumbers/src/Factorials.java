import java.util.Scanner;

class Factorials {

    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        int n = 0;
        long fac = 1;
        while (true) {
            n += 1;
            fac *= n;
            if (fac > number) {
                break;
            }
        }
        System.out.println(n);
    }
}
