import java.util.*;
public class Reverse_array{
    public static void swap(int nums[]){
        int start = 0;
        int last = nums.length-1;

        while(start < last){
        int temp = nums[start];
        nums[start] = nums[last];
        nums[last] = temp;

        start++;
        last--;
        }
    }
    public static void main(String[]args){
        int nums[]= {2, 4, 6, 8, 10};

        swap(nums);
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}

// time complexity: O(n)
// space complexity: O(1) 
