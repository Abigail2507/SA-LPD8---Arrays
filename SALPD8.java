import java.util.Scanner;

public class SALPD8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        int[] primes = new int[10];
        int[] nonPrimes = new int[10];
        int primeCount = 0;
        int nonPrimeCount = 0;

        System.out.println("Ingresa 10 números:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (isPrime(numbers[i])) {
                primes[primeCount] = numbers[i];
                primeCount++;
            } else {
                nonPrimes[nonPrimeCount] = numbers[i];
                nonPrimeCount++;
            }
        }

        System.out.println("Array original mostrando la posición del array más el valor:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + numbers[i]);
        }

        System.out.println("Array con los números primos en las primeras posiciones, mostrando la posición del array más el valor:");
        for (int i = 0; i < primeCount; i++) {
            System.out.println(i + " - " + primes[i]);
        }
        for (int i = 0; i < nonPrimeCount; i++) {
            System.out.println((primeCount + i) + " - " + nonPrimes[i]);
        }
        
        // Cerrando el Scanner
        scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

