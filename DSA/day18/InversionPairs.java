package DSA.day18;

public class InversionPairs {
    public static int invPairs(int arr[],int si , int ei){
        if(si>=ei){
            return 0;
        }
        int mid = si + (ei-si)/2;    //(si+ei)/2
        int lc = invPairs(arr, si, mid);
        int rc = invPairs(arr, mid+1, ei);
        return lc + rc +concure(arr,si , mid , ei);
    }
    public static int concure(int arr[] , int si , int mid , int ei){
        int merged [] = new int [ei-si+1];
        int ind1 = si;
        int ind2 = mid+1;
        int x = 0 ; 
        int count = 0;
        while (ind1 <=mid && ind2 <= ei) {
            if(arr[ind1]<=arr[ind2]){
                merged[x++] = arr[ind1++];
            }else{
                merged[x++] = arr[ind2++];
                count+=(mid-ind1+1);
            }
            
        }
        while(ind1 <= mid){
            merged[x++] = arr[ind1++];
        }
        while(ind2 <= ei){
            merged[x++] = arr[ind2++];
        }
        for (int i = 0 ,  j=si; i < merged.length; i++,j++) {
            arr[j]=merged[i];
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,5,2,7};
        System.out.println(invPairs(arr,0,arr.length-1));
    }
}
