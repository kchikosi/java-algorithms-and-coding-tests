package datastructures.threads;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SynchronizeThreadsTest extends TestCase {

    @Test
    public void testInvoke() {
        SynchronizeThreads threads = new SynchronizeThreads();
        int res = threads.invokeCounter();
        Assert.assertTrue(res == 10);
    }

    @Test
    public void testCreateThread() throws InterruptedException {
        SynchronizeThreads threads = new SynchronizeThreads();
        int count = threads.runSingleThread();
        Assert.assertEquals("Result ", 10, count);
    }

    @Test
    /**
     * test this by adding/removing the synchronized modifier
     */
    public void testCreateMultipleThreads() throws InterruptedException {
        SynchronizeThreads threads = new SynchronizeThreads();
        int count = threads.runMultipleThreads();
        Assert.assertEquals("Result ", 20, count);
    }
}