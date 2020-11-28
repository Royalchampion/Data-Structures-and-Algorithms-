// A program to find out the number of prime factors.
public class PrimeFactors {
    public static void main(String[] args) {
        primeFactors(450);
    }

    public static void primeFactors(int number) {
        /* More optimized solution
        for(int i=2; i*i<=n; i++) {
            while(n%i==0) {
                print(i);
                n=n/10;
            }
        }
        if(n>1) {
            print(n);
        }
        */
        for (int i=2; i<number; i++) {
            if (isPrime(i)) {
                int x = i;
                while (number%x == 0) {
                    System.out.println(i);
                    x = x*i;
                }
            }
        }
    }

    public static boolean isPrime(int number) {

//        Most efficient method
        if (number == 1) {
            return false;
        }

        if (number==2 || number==3) {
            return true;
        }

        if (number%2==0 || number%3==0) {
            return false;
        }

        for (int i=5; i*i<=number; i+=6) {
            if (number%i==0 || number%(i+2)==0) {
                return false;
            }
        }
        return true;
    }
}
