package DSA.day15;

public class string3 {
    public static void main(String[] args) {
        //Permutation in String
        String s1 = "ab";
        String s2 = "eidbaooo";
        int freq[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)-'a']++;
        }
        int windSize = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            int windIdx = 0 ; int idx = i;
            int windoFreq[] = new int[26];
            while (windIdx < windSize && idx <s2.length()) {
                windoFreq[s2.charAt(idx)-'a']++;
                windIdx++; idx++;
            }
            if(isFreqSame(freq,windoFreq)){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
    public static boolean isFreqSame(int freq[] , int windoFreq[]){
        for (int i = 0; i < 26; i++) {
            if(freq[i] != windoFreq[i]) return false;
        }
        return true;
    }
}
