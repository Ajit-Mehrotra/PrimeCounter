package app;


public class FasterPrimeCounter {
//test comment
    public boolean isPrime(int N) {
      
        for (int counter = 2; counter <= N/2; counter++) {
            if (N%counter == 0) {
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