package datastructures.anagram;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class AnagramTest extends TestCase {
    @Test
    public void testIsAnagram() {
        Anagram anagram = new Anagram();
        String s = "gram";
        String t = "gram";

        Assert.assertTrue(anagram.isAnagram(s,t));

    }

}