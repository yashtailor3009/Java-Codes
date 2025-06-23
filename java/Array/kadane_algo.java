public class kadane_algo{
    public static void kadane(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;  // - infinity value
        for(int i = 0;i< nums.length;i++){
            currSum = currSum + nums[i];
            if(currSum < 0){
                currSum = 0; // reset current sum if it goes negative
            }
            maxSum = Math.max(maxSum, currSum); // update max sum if current sum is greater
        }
        System.out.println("Maximum subarray sum is: "+maxSum);
    }
    public static void main (String [] args){
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(nums);
    } 
}

// // time complexity: O(n)
// // space complexity: O(1) 