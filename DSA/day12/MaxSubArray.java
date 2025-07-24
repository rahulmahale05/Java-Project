package DSA.day12;

public class MaxSubArray {
    public static void main(String[] args) {
        //Kadane's Algorithm
        int a[] = {-4,-3,2,4,-1,5,6,3,-6,8,-9,8,5};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int val : a) {
            sum += val;
            max = Math.max(max, sum);
            if(sum<0) sum = 0;
        }
        System.out.println(max);
    }
}
