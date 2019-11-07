package app;

public class FastestPrimeCounter {
    private int[] alreadyFound; // ascending order
    private int numPrimes;

    public boolean isPrime(int N) {
      
        for (int i = 0; alreadyFound[i] <= Math.sqrt(N); i++) {
            if (alreadyFound[i] != 0 && N % alreadyFound[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimes(int limit) {
        alreadyFound = new int[1];
        alreadyFound[0] = 2;
        numPrimes = 1;

        for (int counter = 3; counter <= limit; counter++) {
            if (isPrime(counter)) {
                numPrimes++;
                if (numPrimes >= alreadyFound.length) {
                    int[] newArray = new int[alreadyFound.length * 2];
                    for (int AFcounter = 0; AFcounter < alreadyFound.length; AFcounter++) {
                        newArray[AFcounter] = alreadyFound[AFcounter];
                    }
                    alreadyFound = newArray;
                }

                alreadyFound[numPrimes - 1] = counter;
            }

        }
        return numPrimes;
    }
}