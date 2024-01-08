package binarysearch;

public class RotatedSortedArray {
    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1; // Corrected high value initialization
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] >= arr[low]) {
                // Left part is sorted
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // Right part is sorted
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        int target = 5;
        System.out.println(search(arr, target));
    }
}
