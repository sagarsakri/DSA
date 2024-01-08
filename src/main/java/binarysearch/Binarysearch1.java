package binarysearch;

public class Binarysearch1 {
    public static int search(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 9};
        int target = 7;
        System.out.println(search(arr, target));
    }
}
