package strings;

public class RotatedString {
    public static void main(String[] args) {
        String s = "abcd";
        String goal = "dabc";
        System.out.println(find(s, goal));
    }

    public static boolean find(String s, String goal) {
        return (s.length() == goal.length() && (s + s).contains(goal));
    }
}
