import java.util.*;

public class pairs{
    public static void pairs(int nums[]){
        int total_Pairs= 0;
    for (int i = 0; i<nums.length;i++){
        int current = nums[i];
        for(int j = i+1;j<nums.length;j++){
            System.out.print("(" + current + "," + nums[j] + ")");
            total_Pairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " +total_Pairs);
    }
    public static void main(String[] args){
        int nums[] = {2,4,6,8,10};

        pairs(nums);
    }
}