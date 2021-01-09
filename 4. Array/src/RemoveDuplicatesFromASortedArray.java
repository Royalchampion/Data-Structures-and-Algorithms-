public class RemoveDuplicatesFromASortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{3, 4, 4, 5, 5, 5}));
    }

    public static int removeDuplicates(int arr[]) {
        int n = arr.length;
        int temp[] = new int[n];
        temp[0] = arr[0];
        int res = 1;
        for (int i=1; i<n; i++) {
            if (temp[res-1]!=arr[i]) {
                temp[res]=arr[i];
                res++;
            }
        }
        for (int j=0; j<res; j++) {
            arr[j]=temp[j];
        }
        return res;
    }
}
