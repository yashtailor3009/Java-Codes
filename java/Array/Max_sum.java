public class Max_sum{
    public static void Max_sum( int nums[]){

        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        for (int i =0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                currSum = 0;
                for(int k =i; k<=j;k++){
                    currSum += nums[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum = "+maxSum); 
    }
    public static void main(String[] args){
        int nums[] = {1,-2,6,-1,3};
        Max_sum(nums);
    } 
}

// time complexity: O(n^3)
// space complexity: O(1)