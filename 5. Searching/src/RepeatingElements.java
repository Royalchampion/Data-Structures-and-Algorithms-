import java.util.Arrays;

public class RepeatingElements {
    public static void main(String[] args) {
        System.out.println(findTheRepeatingElementNaive(new int[]{0, 2, 1, 3, 2, 2}));
        System.out.println(findTheRepeatingElementEfficient(new int[]{0, 2, 1, 3, 2, 2}));
        System.out.println(findTheRepeatingElementBySorting(new int[]{0, 2, 1, 3, 2, 2}));
    }

//    Time Complexity : O(n*n)
//    Auxiliary Space : O(1)
    public static int findTheRepeatingElementNaive(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i]==arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

//    Time Complexity : O(n)
//    Auxiliary Space : O(n)
    public static int findTheRepeatingElementEfficient(int arr[]) {
        boolean visited[] = new boolean[arr.length - 1];
        Arrays.fill(visited, Boolean.FALSE);
        for (int i=0; i<arr.length; i++) {
            if (visited[arr[i]]) {
                return arr[i];
            }
            visited[arr[i]] = true;
        }
        return -1;
    }

//    Time Complexity : O(nlogn)
//    Auxiliary Space : O(1)
    public static int findTheRepeatingElementBySorting(int arr[]) {
        Arrays.sort(arr);
        for (int i=1; i<arr.length-1; i++) {
            if (arr[i]==arr[i-1]) {
                return arr[i];
            }
        }
        return -1;
    }
}
