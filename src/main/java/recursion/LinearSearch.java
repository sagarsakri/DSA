package recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 54, 6, 7, 8, 9};
        int target = 8;
        System.out.println(find(arr, target, 0));

    }

    public static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }
}
