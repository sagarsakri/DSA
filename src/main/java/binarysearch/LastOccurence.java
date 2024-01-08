package binarysearch;

public class LastOccurence {
    public static int last(int[]arr,int target) {
        int ans = -1;
        int low = 0, high = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                ans = mid;
                low=mid+1;

            } else if (target < arr[mid]) {
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]arr={3,3,3,4,5,5,6};
        int target=5;
        System.out.println(last(arr,target));
    }
}
