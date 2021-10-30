// You can experiment here, it won’t be checked
public class Task {

    public boolean checkIn(int n, int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == n) {
                return true;
            }
        }
        return false;
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int low = A[0] + 1;
        while (checkIn(low, A)) {
            low = 1;
        }
        return low;

    }
}