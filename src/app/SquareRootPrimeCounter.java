package app;

public class SquareRootPrimeCounter{
    public boolean isPrime(int N) {
        
        for (int counter = 2; counter <= Math.sqrt(N); counter++) {
            if (N % counter == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimes(int limit) {
        int numOfPrimes = 0;

        for (int counter = 2; counter <= limit; counter++) {
            if (isPrime(counter)) {
                numOfPrimes++;
            }
        }
        return numOfPrimes;
    }
}