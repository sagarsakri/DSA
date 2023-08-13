package strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String find(String[] s) {
        if (s == null || s.length == 0) return " ";
        Arrays.sort(s);
        String s1 = s[0];
        String s2 = s[s.length - 1];
        int ind = 0;
        int minLen = Math.min(s1.length(), s2.length());
        while (ind < minLen && s1.charAt(ind) == s2.charAt(ind)) {
            ind++;
        }
        return s1.substring(0, ind);
    }

    public static void main(String[] args) {
        String[] s = {"Flower", "Flow", "Flight"};
        System.out.println(find(s));

    }
}
