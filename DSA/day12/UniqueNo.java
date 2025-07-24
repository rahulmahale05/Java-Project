package DSA.day12;

public class UniqueNo {
    public static void main(String[] args) {
        int a[] = {1,2,3,2,1};
        int sum = 0;
        for (int val : a) {
            sum = sum^val;
        }
        System.out.println(sum);
    }
}
