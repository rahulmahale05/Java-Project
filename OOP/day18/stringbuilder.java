package day18;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello1");
        // for (int i=0;i<s.length()/2;i++){
        //     int front = i;
        //     int back = (s.length()-1)-i;
        //     char frontchar=s.charAt(front);
        //     char backchar=s.charAt(back);
        //     s.setCharAt(frontchar, backchar);
        //     s.setCharAt(backchar, frontchar);
        // }
        System.out.println(s);
        System.out.println(s.charAt(0));
    }
    
}
