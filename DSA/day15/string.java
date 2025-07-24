package DSA.day15;

public class string {
    public static void main(String[] args) {
        String str = "Ac3?e35c&a";
        String st = str.toLowerCase();
        int s = 0;
        int e = st.length()-1;
        while (s<e) {
            if(!isAphaNum(st.charAt(s))){
                s++;
                continue;
            }
            if(!isAphaNum(st.charAt(e))) {
                e--;
                continue;
            }
            if(st.charAt(s++) != st.charAt(e--)){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
    public static boolean isAphaNum(char ch){
        if(ch >= 'a' && ch <= 'z'|| ch>='0' && ch<='9') return true;
        return false;
    }
}
