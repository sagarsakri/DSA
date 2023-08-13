package strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(find(s, t));

    }

    public static boolean find(String s, String t) {
        char[] sc = s.toCharArray();
        char[] st = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(st);
        return Arrays.equals(sc, st);
    }
}
