// package practice1;

public class first {
    public static void main(String[] args) {
        // fibo(0, 1, 10);

        // System.out.println(stack(4,4));
        // String a = "Rahul";
        // reverse(a, 4);

        // System.out.println(Hanoi(3,"S","H","D",1));
        
        // int arr[] = {6,3,9,5,2,8};
        // divide(arr, 0, 5);
        // for (int i : arr) {
        //     System.out.print(i+"\t");
        // }

        // combination("123", "", 0);

        int [] arr = {3,5,7,8,4,5,2};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void fibo(int a,int b, int n){
        if(n==0) return;
        System.out.println(a);
        fibo(b, a+b, n-1);
    }

    static int stack(int x,int n){
        if(n==0) return 1;
        if(x==0) return 0;
        // return x*stack(x,n-1);
        if(n%2==0) return stack(x,n/2)*stack(x, n/2);
        else return x*stack(x,n/2)*stack(x, n/2);
    }

    static void reverse(String str ,int i){
        if(i==0){System.out.println(str.charAt(i)); return;}
        System.out.print(str.charAt(i));
        reverse(str,i-1);
    }

    static int Hanoi(int n,String source , String helper , String dest , int a){
        if(n==1){System.out.println("Transfer disk "+n+" from "+source+" to "+dest); return a;}
        a++;
        a=Hanoi(n-1,source,dest,helper,a);
        System.out.println("Transfer disk "+n+" from "+source+" to "+dest);
        a++;
        a=Hanoi(n-1,helper,source,dest,a);
        return a;
    }


    static void divide(int[] arr , int si , int ei){
        if(si>=ei) return ;
        int mid = si + (ei-si)/2;    //(si+ei)/2
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        concure(arr,si , mid , ei);
    }
    static void concure(int[] arr, int si , int mid , int ei){
        int [] merged = new int[ei-si+1];
        int ind1=si;
        int ind2=mid+1;
        int i=0;
        while(ind1<=mid && ind2<=ei){
            if(arr[ind1]<=arr[ind2]) merged[i++]=arr[ind1++];
            else merged[i++]=arr[ind2++];
        }
        while (ind1<=mid) merged[i++]=arr[ind1++];
        while (ind2<=ei) merged[i++]=arr[ind2++];
        for (int j=0 , k=si; j < merged.length; j++,k++) {
            arr[k]=merged[j];
        }
    }

    static void combination(String st,String perm , int ind){
        if(st.length()==0) {System.out.println(perm); return;}
        for (int i = 0; i < st.length(); i++) {
            char current = st.charAt(i);
            String newSt = st.substring(0, i)+st.substring(i+1);
            combination(newSt, perm+current, ind+1);
        }
    }


}
