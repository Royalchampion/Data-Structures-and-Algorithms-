public class RecursivePower {
    public static void main(String[] args) {
        System.out.println(RecursivePower(3, 4));
    }

    public static int RecursivePower(int n,int p)
    {
        if(p==0) {
            return 1;
        }
        else if(p==1) {
            return n;
        }
        return n*RecursivePower(n, p-1);
    }
}
