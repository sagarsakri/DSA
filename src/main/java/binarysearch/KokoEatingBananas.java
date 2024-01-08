package binarysearch;

public class KokoEatingBananas {
    public static int findmax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);

        }
        return max;
    }

    public static int calculateTotalHours(int[] arr, int hourly) {
        int totalh = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            totalh += Math.ceil((double) (arr[i]) / (double) (hourly));
        }
        return totalh;

    }

    public static int rate(int[] arr, int h) {
        int max = findmax(arr);
        for (int i = 1; i <= max; i++) {
            int reqTime = calculateTotalHours(arr, i);
            if (reqTime <= h) {
                return i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {7, 15, 6, 3};
        int h = 8;
        System.out.println(rate(arr, h));
    }

}
