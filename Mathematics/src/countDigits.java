public class countDigits {
    public static void main(String[] args) {
        System.out.println(count(192810));
    }

    public static long count(long number) {
        long count=0;
        while (number!=0) {
            number = number/10;
            ++count;
        }
        return count;
    }
}
