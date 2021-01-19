// Write a program to find the maximum and second maximum element in an array.

import java.util.ArrayList;

public class ArrayMaxAndSecondMax {
//    Time Complexity : O(n)
//    Space Complexity : O(1)
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        int largest = arr[0];
        int secondLargest = 0;
        for(int i=1; i<arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if ((arr[i] > secondLargest) && (arr[i] != largest)) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == 0) {
            secondLargest = -1;
        }
        ArrayList<Integer> largestAndSecondLargest = new ArrayList<Integer>();
        largestAndSecondLargest.add(largest);
        largestAndSecondLargest.add(secondLargest);
        return largestAndSecondLargest;
    }
}
