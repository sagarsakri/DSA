package binarysearch;

public class FindSqrt {
    public static int find(int n) {
        int low = 1, high = n;
        while (low <= high) {
            double mid = (low + high) / 2;
            double value = mid * mid;
            if (value <= (long) (n)) {
                low = (int) (mid + 1);
            } else {
                high = (int) (mid - 1);
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int n = 28;
        int ans = find(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }
}


