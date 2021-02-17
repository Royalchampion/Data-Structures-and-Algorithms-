// Write a program for trapping rain water problem.
public class TrappingRainWaterProblem {
    public static void main(String[] args) {
        System.out.println(calcRainWaterProblem(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println(findWater(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

//     Time Complexity : O(n)
//     Auxiliary Space : O(1)
    public static int findWater(int arr[]) {
        int result = 0;

        int leftMax = 0;
        int rightMax = 0;

        int initial = 0;
        int last = arr.length - 1;

        while (initial <= last) {
            if (arr[initial] < arr[last]) {
                if (leftMax < arr[initial]) {
                    leftMax = arr[initial];
                }
                else {
                    result += leftMax - arr[initial];
                }
                initial++;
            }
            else {
                if (rightMax < arr[last]) {
                    rightMax = arr[last];
                }
                else {
                    result += rightMax - arr[last];
                }
                last--;
            }
        }
        return result;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//     Time Complexity : O(n)
//     Auxiliary Space : O(1)
    public static int calcRainWaterProblem(int arr[]) {
        int base = 0;
        int result = 0;
        int diff = 0;

        if (isSorted(arr)) {
            return 0;
        }

        if (arr[0] >= arr[arr.length-1]) {
            base = arr[arr.length-1];
        }
        else if (arr[arr.length-1] >= arr[0]){
            base = arr[0];
        }

        for (int i=1; i<=arr.length-2; i++) {
            if (base > arr[i]) {
                diff = base - arr[i];
                result = result + diff;
            }
        }
        return result;
    }

    public static boolean isSorted(int arr[]) {
        if (arr[0] > arr[arr.length-1]) {
            for (int i=0; i<arr.length; i++) {
                if (arr[i] < arr[i+1]) {
                    break;
                }
            }
            return false;
        }
        if (arr[0] <= arr[arr.length-1]) {
            for (int j=0; j<arr.length; j++) {
                if (arr[j] > arr[j+1]) {
                    break;
                }
            }
            return false;
        }
        return true;
    }
}
