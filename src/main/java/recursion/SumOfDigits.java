package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sum(1234);
        System.out.println(ans);
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n % 10 + sum(n / 10);
    }
}
