package app;

public class PrimeTester {

        public static void main(String args[]) {

                // FasterPrimeCounter Driver
                FirstPrimeCounter FirstTest = new FirstPrimeCounter();
                long startTime = System.currentTimeMillis();
                System.out.println("First | 1000 times: " + FirstTest.countPrimes(1000) + " in "
                                + (System.currentTimeMillis() - startTime) + " milliseconds");
                startTime = System.currentTimeMillis();
                System.out.println("First | 10000 times: " + FirstTest.countPrimes(10000) + " in "
                                + (System.currentTimeMillis() - startTime) + " milliseconds");

                System.out.println();
                // FasterPrimeCounter Driver
                FasterPrimeCounter FastTest = new FasterPrimeCounter();
                startTime = System.currentTimeMillis();
                System.out.println("Fast | 1000 times: " + FastTest.countPrimes(1000) + " in "
                                + (System.currentTimeMillis() - startTime) + " milliseconds");
                startTime = System.currentTimeMillis();
                System.out.println("Fast | 10000 times: " + FastTest.countPrimes(10000) + " in "
                                + (System.currentTimeMillis() - startTime) + " milliseconds");
                startTime = System.currentTimeMillis();
                System.out.println("Fast | 100000 times: " + FastTest.countPrimes(100000) + " in "
                                + (System.currentTimeMillis() - startTime) + " milliseconds");

                System.out.println();
                // SquareRootPRimeCounter Driver
                SquareRootPrimeCounter SquareRootTest = new SquareRootPrimeCounter();
                startTime = System.currentTimeMillis();
                System.out.println("Sqrt | 1000 times: " + SquareRootTest.countPrimes(1000) + " in "
                                + (System.currentTimeMillis() - startTime) + " milliseconds");
                startTime = System.currentTimeMillis();
                System.out.println("Sqrt | 10000 times: " + SquareRootTest.countPrimes(10000) + " in "
                                + (System.currentTimeMillis() - startTime) + " milliseconds");
                startTime = System.currentTimeMillis();
                System.out.println("Sqrt | 100000 times: " + SquareRootTest.countPrimes(100000) + " in "
                                + (System.currentTimeMillis() - startTime) + " milliseconds");

                System.out.println();
                // SquareRootPRimeCounter Driver
                FastestPrimeCounter FastestPrimeTest = new FastestPrimeCounter();
                startTime = System.currentTimeMillis();
                System.out.println("Faster | 1000 times: " + FastestPrimeTest.countPrimes(1000) + " in "
                                + (System.currentTimeMillis() - startTime) + " milliseconds");
                startTime = System.currentTimeMillis();
                System.out.println("Faster | 10000 times: " + FastestPrimeTest.countPrimes(10000) + " in "
                                + (System.currentTimeMillis() - startTime) + " milliseconds");
                startTime = System.currentTimeMillis();
                System.out.println("Faster | 100000 times: " + FastestPrimeTest.countPrimes(100000) + " in "
                                + (System.currentTimeMillis() - startTime) + " milliseconds");
        }

}