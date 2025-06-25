public class insertion_sort{
    public static void insertion_sort(int arr[]){
        for(int i =1 ; i < arr.length;i++){
            int curr = arr[i];// current element to be inserted
            int prev = i-1;// previous element to compare with
            // finding out the correct pos to insert
            while(prev >= 0 && arr[prev] > curr)// compare with previous element
            {
                arr[prev+1] = arr[prev]; // shift the element to the right
                prev--; // move to the left
            }
            // insertion 
            arr[prev+1]=curr; // insert the current element at the correct position
        }
    }
    public static void printarr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        insertion_sort(arr);
        printarr(arr);

    }
}