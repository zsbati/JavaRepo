import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int count = 0;
        //System.out.println(arr[0]);
        for (int i = 0; i<arr.length; i++){
            for (int j=0; j<=i; j++){
                sum = 0;
                for (int k=j; k<=i; k++){
                    sum += arr[k];
                }
                if (sum < 0){
                    count++;
                }
            }
        }

        System.out.println(count);

    }

}
