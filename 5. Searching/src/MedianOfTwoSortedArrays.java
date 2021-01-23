public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(getMedian(new int[]{10, 20, 30, 40, 50}, new int[]{5, 15, 25, 35, 45}));
    }

//    Time Complexity : O(log(n))
//    Auxiliary Space : O(1)
    public static double getMedian(int array1[], int array2[]) {
        int n1 = array1.length;
        int n2 = array2.length;
        int begin1 = 0;
        int end1 = n1;
        while (begin1 < end1) {
            int i1 = (begin1 + end1)/2;
            int i2 = (n1 + n2 + 1)/2 - i1;
            int min1 = (i1 == n1)?Integer.MAX_VALUE:array1[i1];
            int max1 = (i1 == 0)?Integer.MIN_VALUE:array1[i1-1];
            int min2 = (i2 == n2)?Integer.MAX_VALUE:array2[i2];
            int max2 = (i2 == 0)?Integer.MIN_VALUE:array2[i2-1];
            if (max1<=min2 && max2<=min1) {
                if ((n1 + n2)%2 == 0) {
                    return ((double) Math.max(max1, max2) + Math.min(min1, min2))/2;
                }
                else {
                    return (double) Math.max(max1, max2);
                }
            }
            else if (max1 > min2) {
                end1 = i1 - 1;
            }
            else {
                 begin1 = i1 + 1;
            }
        }
        return -1;
    }
}
