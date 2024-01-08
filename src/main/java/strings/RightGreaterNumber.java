package strings;

import java.util.Stack;

public class RightGreaterNumber {
    public static int[] check(String[] s) {
        int n = s.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            int currentValue = Integer.parseInt(s[i]);

            while (!stack.isEmpty() && currentValue > stack.peek()) {
                stack.pop();
            }

            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(currentValue);
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] s = {"1", "2", "3", "4", "5" };
        int[] result = check(s);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
