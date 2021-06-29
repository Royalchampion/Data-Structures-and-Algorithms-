public class InsertAtThisIndexInAnArray {
        // You need to insert the given element at the given index.
        // After inserting the elements at index, elements
        // from index onward should be shifted one position ahead
        // You may assume that the array already has sizeOfArray - 1
        // elements.

//    Time Complexity : O(n)
//    Space Complexity : O(1)
        public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
        {
            for(int i=arr.length-1; i>index; i--) {
                arr[i] = arr[i-1];
            }
            arr[index] = element;
        }
}
