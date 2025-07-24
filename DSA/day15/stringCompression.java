package DSA.day15;

public class stringCompression {
    public static void main(String[] args) {
        String a = "aaabbcccccd";
        int count = 1;
        String ans = "";
        for (int i = 0; i < a.length()-1; i++) {
            if(a.charAt(i)==a.charAt(i+1)) count++;
            else{
                ans+=a.charAt(i);
                ans+=(char)(count+'0');
                count=1;
            }
        }
        ans+=a.charAt(a.length()-1);
        ans+=(char)(count+'0');
        System.out.println(ans);
    }
}
