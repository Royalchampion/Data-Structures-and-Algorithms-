public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println(digitalRoot(1234));
    }

    public static int digitalRoot(int n)
    {
        if(n<10) {
            return n;
        }
        int firstSum = digitalRoot(n/10)+(n%10);
        if(firstSum>=10) {
            return digitalRoot(firstSum);
        }
        return firstSum;
    }
}
