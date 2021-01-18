import java.util.Arrays;

public class MeanAndMedian {
    public int median(int A[],int N)
    {
        int median = 0;
        Arrays.sort(A);
        if(N%2 == 0) {
            median = (int) Math.floor((A[N/2] + A[(N/2)-1]) / 2);
        }
        else {
            median = A[N/2];
        }
        return median;
        //Your code here
        //If median is fraction then conver it to integer and return
    }

    public int mean(int A[],int N)
    {
        int mean = 0;
        int sum = 0;
        for(int i=0; i<N; i++) {
            sum += A[i];
        }
        mean = sum/N;
        return mean;
    }
}
