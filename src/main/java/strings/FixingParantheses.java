package strings;

public class FixingParantheses {
    public static String remove(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) sb.append(c);
                count++;
            } else if (c == ')') {
                count--;
                if (count > 0) {
                    sb.append(c);
                    //count--;
                }

            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "()(())";
        System.out.println(remove(s));
    }

}
