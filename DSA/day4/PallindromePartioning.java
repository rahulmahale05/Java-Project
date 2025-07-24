package DSA.day4;

import java.util.ArrayList;

public class PallindromePartioning {
    public static boolean isPallindrome(String s){
        int st = 0;
        int e = s.length()-1;
        while (st<e) {
            if(s.charAt(st++) != s.charAt(e--)) return false;
        }
        return true;
    }
    public static void getAllParts(String s , ArrayList<String> comb , ArrayList<ArrayList<String>> ans){
        if(s.length() == 0){
            ans.add(new ArrayList<>(comb));
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            String part = s.substring(0,i+1);
            if(isPallindrome(part)){
                comb.add(part);
                getAllParts(s.substring(i+1), comb, ans);
                comb.removeLast();
            }
        }
    }
    public static void main(String[] args) {
        String s = "aab";
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ArrayList<String> comb = new ArrayList<>();
        getAllParts(s, comb, ans);
        System.out.println(ans);
    }
}
