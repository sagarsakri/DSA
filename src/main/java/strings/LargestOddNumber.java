package strings;

public class LargestOddNumber {
    public static void main(String[] args) {
        String s = "247";
        System.out.println(find(s));
    }

    public static String find(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) % 2 != 0) return s.substring(0, i + 1);
        }
        return " ";


    }
}
