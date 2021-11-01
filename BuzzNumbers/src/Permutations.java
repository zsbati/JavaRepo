// to check if an array is a permutation

import java.util.*;

public class Permutations {

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

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array size:");
        int arraySize = sc.nextInt();
        System.out.println("And the elements of the array, integers");
        int element = 0; //add all elements to a linked list
        for (int i = 0; i < arraySize; i++) {
            element = sc.nextInt();
            if (!list.contains(element)) {
                list.add(element);
            }
        }
        System.out.println("The array is permutation: " + Boolean.toString(isPermutation(list, arraySize)));

    }
}
