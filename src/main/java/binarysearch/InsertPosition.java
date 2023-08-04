package binarysearch;

public class InsertPosition {
    public static int insert(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;

            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 9};
        int target = 5;
        System.out.println(insert(arr, target));
    }
}
