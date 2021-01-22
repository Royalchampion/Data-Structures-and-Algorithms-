public class SearchInAnInfiniteArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 10, 15, 20, 40, 60, 80, 100, 200, 500, 1000};
        System.out.println(search(arr, 100));
    }
    
//    Time Complexity : O(n)
//    Space Complexity : O(1)
    public static int search(int arr[], int number) {
        int i=0;
        while (true) {
            if (arr[i] == number) {
                return i;
            }
            if (arr[i] > number) {
                return -1;
            }
            i++;
        }
    }
}
