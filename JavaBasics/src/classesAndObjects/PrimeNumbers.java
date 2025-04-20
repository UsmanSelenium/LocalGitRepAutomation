package classesAndObjects;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");

// Loop numbers from 1 to 100
        for (int num = 1; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

 //check if a number is prime or not
    public static boolean isPrime(int number) {
        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            return false;
        }

// Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
// If divisible, it's not a prime number
            	return false; 
            }
        }
// If no divisors found, it's a prime number
        return true; 
    }
}