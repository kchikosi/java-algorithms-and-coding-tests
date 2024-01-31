package datastructures.anagram;

import java.util.Arrays;

/* An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, “abcd” and “dabc” are an anagram of each other.*/
public class Anagram {
    public Anagram() {
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] c = s.toCharArray();
        Arrays.sort(c);
        char[] d = t.toCharArray();
        Arrays.sort(d);
        System.out.println("c -> " + String.valueOf(c));
        System.out.println("d -> " + String.valueOf(d));
        for (int i = 0; i <= s.length() - 1; i++) {
            if (c[i] != d[i]) {
                return false;
            }
        }
        return true;
    }
}
