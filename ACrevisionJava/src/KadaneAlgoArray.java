//leetcode 53. Maximum Subarray
public class KadaneAlgoArray {
    //Kadane algorithms
    public static int maxOfSubarraySum(int nums[]) {
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            //if(sum<0) sum = 0;//errr
            max = Math.max(sum,max);
            if(sum<0) sum = 0;
        }
        return max;
    }
        //brute force
        // int maxSum = Integer.MIN_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        //     int currentSubArraySum = 0; //fail at [-1]
        //     for (int j = i; j < nums.length; j++) {
        //         currentSubArraySum += nums[j];
        //          maxSum = Math.max(maxSum, currentSubArraySum);
        //     }
        // }
        //  return maxSum;

    public static void main(String[] args) {
        int nums[]= {-1};//{-3,1,1,4,2,-2,-6};
        maxOfSubarraySum(nums);
        System.out.println(maxOfSubarraySum(nums));
    }
}
