package DSA.day12;

public class MostWaterContainer {
    public static void main(String[] args) {
        int a[] = {1,2,7,5,4,3,8,4,5};
        int s = 0;
        int e = a.length-1;
        int max = Integer.MIN_VALUE;
        while (s<e) {
            int w = e-s;
            int h = Math.min(a[s], a[e]);
            int currWater = w*h;
            max = Math.max(max, currWater);

            int ind = a[s]<a[e] ? s++:e--;
        }
        System.out.println(max);
    }
}
