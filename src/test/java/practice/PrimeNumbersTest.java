package practice;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PrimeNumbersTest extends TestCase {

    @Test
    public void testIfPrimeNumber() {
        boolean res = PrimeNumbers.isPrime(67);
        Assert.assertTrue(res);
    }

}