// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class NewPermutations {

    public static boolean isPermutation(LinkedList<Integer> list, int n) {
        if (list.size() != n) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (!list.contains(i+1)) {
                return false;
            }
        }
        return true;
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        LinkedList<Integer> list = new LinkedList<>(); //contains the integers, but only once;
        int arraySize = A.length;

        for (int i = 0; i < A.length; i++){
            if (!list.contains(A[i])) {
                list.add(A[i]);
            }
        }

        if (isPermutation(list, arraySize)) {
            return 1;
        }
        return 0;
    }
}






