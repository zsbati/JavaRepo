import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        String end;
        if (city.length() >= 4) {
            end = city.substring(city.length() - 4);
        } else {
            end = "no";
        }
        if (end.equals("burg")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}