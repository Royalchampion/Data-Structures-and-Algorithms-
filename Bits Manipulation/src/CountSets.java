public class CountSets {
    public static void main(String[] args) {
        System.out.println(countSetsNaive(5));
        System.out.println(countSetsBrianKerningamAlgo(8));
    }

    public static int countSetsNaive(int number) {
        int result=0;
        while (number>0) {
            if ((number&1)==1) {
                result++;
            }
            number=number>>1;
        }
        return result;
    }

    public static int countSetsBrianKerningamAlgo(int number) {
        int result=0;
        while (number>0) {
            number = (number&(number-1));
            result++;
        }
        return result;
    }
}
