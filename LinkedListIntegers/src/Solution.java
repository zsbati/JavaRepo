import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //create the empty linked list
        LinkedList<Integer> llist = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            llist.add(sc.nextInt());
        }
        String act = "";
        int index = 0; //index
        int element = 0; //element, if any
        int ops = sc.nextInt();
        for (int i = 0; i < ops; i++) {
            act = sc.next();
            if (act.equals("delete")) {
                index = sc.nextInt();
                llist.remove(index);
            }
            if (act.equals("insert")) {
                index = sc.nextInt();
                element = sc.nextInt();
                llist.add(index, element);
            }
        }

        String output = String.valueOf(llist.get(0));
        if (llist.size() != 1) {
            for (int i = 1; i < llist.size(); i++) {
                output = output + " " + llist.get(i);
            }
            System.out.println(output);
        }

    }
}
