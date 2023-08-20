package datastructures.palindrome;

/**
 * use recursion
 */
public class PalindromeOne {

    public static boolean isPalindrome(String s) {
        if (s.isEmpty() || s == null) {
            return false;
        }
        return s.equals(reverse(s));
    }

    private static String reverse(String i) {
        if (i == null || i.isEmpty()) {
            return i;
        }
        return i.charAt((i.length() - 1))
                + reverse(i.substring(0, (i.length() - 1)));
    }
}
