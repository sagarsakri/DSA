package binarysearch;

public class NthRoot {
    public static void main(String[] args) {
        int n =4, m = 69;
        System.out.println(find(n,m));
    }

    public static int find(int n, int m) {
        int low = 1, high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            int p = (int) Math.pow(mid, n);
            if (p == m) return mid;
            if (p < m) low = mid + 1;
            else high = mid - 1;


        }
        return -1;
    }
}
