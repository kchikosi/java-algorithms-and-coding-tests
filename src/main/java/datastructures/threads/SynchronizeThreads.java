package datastructures.threads;

public class SynchronizeThreads {

    static int count;
    public int invokeCounter() {
        Counter counter = new Counter();
        try {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        } catch (Exception e) {
            return 0;
        }
        return count;
    }

    /**
     * create a single thread
     *
     * @return
     * @throws InterruptedException
     */
    public int runSingleThread() throws InterruptedException {
        Thread thread = new Thread(() -> invokeCounter());
        thread.start();
        thread.join(); // allows invokeCounter() to complete operation
        System.out.println(" Count " + count);
        return count;
    }

    /**
     * create multiple threads
     * demonstrate that both threads are access the same invokeCounter method
     * if the synchronized keyword is not used, the outcome should be unpredictable
     *
     * @return
     */
    public int runMultipleThreads() throws InterruptedException {
        Thread thread = new Thread(() -> invokeCounter());
        Thread thread1 = new Thread(() -> invokeCounter());

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println("Count is "+ count);
        return count;
    }


    /**
     *  this method is called by one or more threads
     *  we use the 'synchronized' keyword to ensure single thread
     *  access at a time
     */
    class Counter {
        public synchronized void increment() {
            count++;
        }
    }
}
