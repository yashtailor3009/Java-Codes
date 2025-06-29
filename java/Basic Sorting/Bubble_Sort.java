public class Bubble_Sort{
    public static void sort(int arr[]){
        for(int i = 0;i < arr.length-1;i++){
            for(int j =0;j<arr.length-i-1;j++){
                // swap 
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }            
        }
    }
    public static void printarr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        sort(arr);
        printarr(arr);

    }
}
// time complexity: O(n^2)
// space complexity: O(1)