public class Linear_Search{
    public static int search(int nums[], int key){
        for (int i = 0; i <nums.length;i++){
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int nums[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        int index = search(nums,key);
        if(index == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.print("Key is at index : " +index);
        }
    }
}