package DSA.day4;

public class quicksort {
    public static int partition(int arr[] , int low , int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //swap the pivot
        i++;
        int temp = arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i ; //pivot index
    }
    public static void quickSort(int arr[] , int low , int high){
        if(low<high){
            int pi = partition(arr,low ,high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    
    public static void main(String[] args) {
        int [] arr = {6,3,9,5,2,8};
        int n = arr.length;
        
        quickSort(arr, 0 , n-1);

        //print
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
