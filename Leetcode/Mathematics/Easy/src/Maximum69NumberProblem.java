public class Maximum69NumberProblem {
    public static void main(String[] args) {
        System.out.println(changeTheNumber(6969));
    }

    public static int changeTheNumber(int number) {
        int max = number;
        int temp = number;
        int index = 0;
        int last = 0;

        while (temp>0) {
            last = temp%10;
            temp /= 10;

            if (last==6) {
                int updated = number + 3 * (int)(Math.pow(10, index));
                if (updated>max) {
                    max = updated;
                }
            }
            index++;
        }
        return max;
    }
}
