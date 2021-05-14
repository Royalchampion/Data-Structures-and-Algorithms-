//  Find nth natural number after removing all the numbers consisting of the digit 9.
public class NthNaturalNumber {
    public static void main(String[] args) {
        System.out.println(findNthNaturalNumber(9));
    }

    //  Time Complexity : O(log n (base9))
    //  Auxiliary Space : O(1)
    public static long findNthNaturalNumber(long number) {
        long result = 0;
        long pos = 1;
        while (number>0) {
            result += (pos*(number%9));
            number/=9;
            pos*=10;
        }
        return result;
    }
}
