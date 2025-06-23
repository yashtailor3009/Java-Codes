public class largest_array{
    public static int largest(int nums[]){
        int largest = Integer.MIN_VALUE; //-Infinity
        int smallest = Integer.MAX_VALUE; //+Infinity

        for (int i = 0;i<nums.length;i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
            if(nums[i]<smallest){
                smallest = nums[i];
            }
        }
        System.out.println("Smallest number is : "+smallest);
        return largest;
    }
    public static void main(String[]args){
        int nums[]={1,2,6,3,5};
        System.out.println("Largest number is : "+largest(nums));

        
    }
}