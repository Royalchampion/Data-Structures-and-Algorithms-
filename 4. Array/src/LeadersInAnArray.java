public class LeadersInAnArray {
    public static void main(String[] args) {
        leaders(new int[]{1, 10, 22, 34, 44, 12, 11});
    }

    public static void leaders(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            boolean flag = false;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i]<=arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag==false) {
                System.out.println(arr[i]);
            }
        }
    }
}
