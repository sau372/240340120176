public class PrimeNumber {

    public static void main(String[] args) {
        int count = 0; // Counter for the number of primes found
        int number = 2; // Number to be checked for primality

        // Loop until we find 10 prime numbers
        while (count < 10) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Handle special cases
        if (num <= 1) return false;
        if (num == 2) return true; // 2 is the only even prime number
        if (num % 2 == 0) return false; // Exclude even numbers

        // Check for factors from 3 to sqrt(num)
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}