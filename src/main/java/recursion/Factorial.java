package recursion;

public class Factorial {
    public static void main(String[] args) {
        int ans = find(5);
        System.out.println(ans);

    }

    public static int find(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * find(n - 1);
    }
}
