// Find out the number of the trailing zeros in the factorial of the program
public class TrailingZero {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    public static int factorial(int number) {
        int factorial = 1;
        int count = 0;

        if (number == 0) {
            return 1;
        }

        for (int i=number; i>=1; i--) {
            factorial = factorial*i;
        }

        int temp = factorial;

        while ((temp % 10) == 0) {
            ++count;
            temp = temp/10;
        }
        return count;

    }
}
