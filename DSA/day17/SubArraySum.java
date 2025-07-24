package DSA.day17;

import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args) {
        int arr [] = {9,4,20,3,10,20};
        int k = 33;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        System.out.println(ans);
    }
}
