package binarysearch;

public class SmallestDivisor {
    public static int findSum(int[] arr, int div) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.ceil((double) (arr[i]) / (double) (div));
        }
        return sum;
    }

    public static int smallesDiv(int[] arr, int limit) {
        int max = Integer.MIN_VALUE;
        if (arr.length > limit) return -1;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int low = 1, high = max;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (findSum(arr, mid) <= limit) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        System.out.println(smallesDiv(arr, limit));
    }
}