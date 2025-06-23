public class Sum_Subarray{

    public static void Sub_array(int nums[]){
        for(int i = 0; i< nums.length;i++){
            for(int j = i ; j < nums.length; j++){
                int sum = 0; 
                for(int k = i ; k <= j;k++){
                    System.out.print(nums[k]+ " ");
                    sum += nums[k];
                }
                System.out.println("==> Sum is:" + sum);
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        int nums[] = {2,4,6,8,10};
        Sub_array(nums);

    }
}