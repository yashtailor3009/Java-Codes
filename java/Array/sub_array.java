public class sub_array{
    public static void Sub_array(int nums[]){
        int total = 0;   // total = n(n+1)/2
        for(int i = 0;i < nums.length;i++){
            for(int j = i;j < nums.length;j++){
                 for(int k =i;k<=j;k++){
                    System.out.print(nums[k] + "");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub arrays:" +total);
    }
    public static void main(String [] args){
        int nums[] = {2,4,6,8,10};
        Sub_array(nums);

    }
}