package DSA.day15;

public class string2 {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        String st = s.replaceAll(part, "");
        System.out.println(st);
    }
}
