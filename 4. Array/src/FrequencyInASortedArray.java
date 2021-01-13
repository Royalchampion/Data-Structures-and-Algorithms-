public class FrequencyInASortedArray {
    public static void main(String[] args) {
        printFrequencyInASortedArray(new int[]{10, 10, 10, 22, 22, 44, 88, 88});
    }

    public static void printFrequencyInASortedArray(int arr[]) {
        int freq = 1;
        int i = 1;
        while (i<arr.length) {
            while (i<arr.length && arr[i]==arr[i-1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " : " + freq);
            i++;
            freq = 1;
        }
    }
}
