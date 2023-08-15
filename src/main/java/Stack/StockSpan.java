package Stack;

import java.util.Arrays;
import java.util.Stack;
//searching on the left side>

public class StockSpan {
    public static int[] findLeft(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] span = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }
        return span;
    }

    public static int[] findRight(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] span = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        int max = 0;
        int[] left = findLeft(arr);
        int[] right = findRight(arr);
        for (int i = 0; i < left.length; i++) {
            max = Math.max(max, arr[i]);
            max = Math.max(max, (left[i] + right[i] - 1) * arr[i]);

        }
        System.out.println(max);
        //System.out.println(Arrays.toString(findLeft(arr)));
        //System.out.println(Arrays.toString(findRight(arr)));
    }
}
