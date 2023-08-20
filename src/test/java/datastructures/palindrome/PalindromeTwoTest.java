package datastructures.palindrome;

import junit.framework.TestCase;
import org.junit.Test;

public class PalindromeTwoTest extends TestCase {
    @Test
    public void testIsPalindrome() {
        String s = "121";
        assertTrue(String.format("Is string '%s' a palindrome? ", s), PalindromeOne.isPalindrome(s));
    }
}