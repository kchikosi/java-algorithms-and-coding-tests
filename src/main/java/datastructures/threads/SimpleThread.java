package datastructures.threads;

public class SimpleThread {
    public static void main(String[] args) throws InterruptedException {
        final int count = 0;
        final Counter c = new Counter(count);

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i >= 10; i++) {
                    c.increment(count);
                }
            }
        });

        t1.start();
        t1.join();
        System.out.println("Count -> " + count);
    }

    static class Counter {
        int count;

        public Counter(int count) {
            this.count = count;
        }

        public synchronized void increment(int count) {
            this.count++;
        }
    }
}
