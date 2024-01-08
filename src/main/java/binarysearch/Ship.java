package binarysearch;

public class Ship {
    public static int findDays(int[] weights, int capacity) {
        int days = 1;
        int load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > capacity) {
                load = weights[i];
            } else load += weights[i];
        }
        return days;
    }

    public static int leastWeightCapacity(int[] weights, int d) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            int noOfDays = findDays(weights, mid);
            if (noOfDays <= d) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        System.out.println(leastWeightCapacity(weights, d));
    }
}