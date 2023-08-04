package binarysearch;

public class FloorAndCeil {
    public static int ceil(int[] arr, int target) {
        int low = 0, high = arr.length, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;


        }
        return ans;
    }

    public static int floor(int[] arr, int target) {
        int low = 0, high = arr.length, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) {
                ans = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 30, 35};
        int target = 25;
        System.out.println(floor(arr, target));
        System.out.println(ceil(arr, target));
    }
}
