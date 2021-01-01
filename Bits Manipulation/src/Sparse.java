public class Sparse {
    public static void main(String[] args) {
        System.out.println(isSparse(2));
    }

    // Function to check if the given number is sparse or not
    public static boolean isSparse(int n){
        if((n&(n>>1))==0) {
            return true;
        }
        else {
            return false;
        }
    }
}
