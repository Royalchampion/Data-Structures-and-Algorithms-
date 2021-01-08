public class RightMostDifferentBit {
    public static void main(String[] args) {
        System.out.println(posOfRightMostDiffBit(9, 9));
    }

    public static int posOfRightMostDiffBit(int m, int n) {
        int differentPosition = 1;
        int result = m ^ n;

        if (m==n) {
            return -1;
        }
        while(result>0) {
            if((result&1)==1) {
                break;
            }
            result=result>>1;
            differentPosition++;
        }
        return differentPosition;
    }
}
