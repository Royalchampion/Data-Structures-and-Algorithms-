public class Practice {
    public static void main(String[] args) {
        System.out.println(countDigits(291));
    }

    public static int countDigits(int number) {
        int count = 1;
        while(number%10!=0) {
            count++;
        }
        return count;
    }
}
