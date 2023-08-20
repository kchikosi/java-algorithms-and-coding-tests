package datastructures.palindrome;

/**
 * use the toCharArray and for loop to retrieve string characters reverse and store in string buffer from end to start
 */
public class PalindromeTwo {

    public static boolean isPalindrome(String s) {
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
        }
        System.out.println(String.format("Reverse string: %s", sb.toString()));
        if (s.equalsIgnoreCase(sb.toString())) {
            return true;
        }
        return false;
    }
}
