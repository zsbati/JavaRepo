import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        String a = sc.next();
        String llist = sc.nextLine();
        llist = a + llist;
        String[] arr = llist.split(" ");
        ArrayList<Integer> l0 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l0.add(Integer.valueOf(arr[i]));
        }
        System.out.println(l0.get(0));
    }
}
