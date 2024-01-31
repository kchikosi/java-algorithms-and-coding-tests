package test;

public class PrimeNumbers {
    public PrimeNumbers() {
    }

    private static boolean isPrime(int n) {
        if (n % 2 != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] arg) {
        PrimeNumbers c = new PrimeNumbers();
        boolean res = c.isPrime(13);
        System.out.println(res);
    }
}
