package binarysearch;

public class UpperBound {

    public static int UBound(int[] arr,int x) {
        int m = arr.length;
        int low = 0, high = m - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]arr={2,2,2,3,4,6};
        int x=3;
        System.out.println(UBound(arr,x));

    }
}



