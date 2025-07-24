import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
    public static void main(String[] args) {
        int arr[] = {-2,-1,-1,1,1,2,2};
        int tar = 0;
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i>0 && arr[i] == arr[i-1]) continue;
            for (int j = i+1; j < arr.length;) {
                int p = j+1;
                int q= arr.length-1;
                while (p<q) {
                    int sum = arr[i]+arr[j]+arr[p]+arr[q];
                    if(sum<tar) p++;
                    else if(sum>tar)q--;
                    else {
                        ArrayList<Integer> ele = new ArrayList<>();
                        ele.add(arr[i]);
                        ele.add(arr[j]);
                        ele.add(arr[p]);
                        ele.add(arr[q]);
                        ans.add(ele);
                        p++;q--;
                        while(p<q && arr[p] == arr[p-1]) p++;
                    }
                }
                j++;
                while(j<arr.length && arr[j] == arr[j-1]) j++;
            }
        }
        System.out.println(ans);
    }
}
