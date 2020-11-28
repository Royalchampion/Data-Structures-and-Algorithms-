import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        sieve(20);
    }

    public static void sieve(int number) {
        boolean isPrime[] = new boolean[number+1];
        Arrays.fill(isPrime, true);
        for (int i=2; i*i<=number; i++) {
            if (isPrime[i]) {
                for (int j=2*i; j<=number; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i=2; i<=number; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
