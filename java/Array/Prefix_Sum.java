public class Prefix_Sum{
    public static void Prefix_Sum(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];
        for(int i = 1; i<prefix.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i = 0; i<nums.length;i++){
            for(int j = i; j < nums.length;j++){
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i -1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }

            }
        }
        System.out.println("Max sum = " + maxSum);
    }
    public static void main (String[] args){
        int nums[] = {1,-2,6,-1,3};
        Prefix_Sum(nums);
    }
}

// time complexity: O(n^2)
// space complexity: O(n) for the prefix array 