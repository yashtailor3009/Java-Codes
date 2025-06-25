public class selection_sort{
    public static void selection_sort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            int minPos = i; // minimum position
            for(int j = i+1;j<arr.length;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j; // update minimum position
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i =0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        selection_sort(arr);
        printarr(arr);
    }
}
// time complexity: O(n^2)
// space complexity: O(1)