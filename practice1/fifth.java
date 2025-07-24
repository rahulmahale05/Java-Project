public class fifth {
    public static void main(String[] args) {
        // System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
        // System.out.println(fact(0));
        // derived d = new derived();
        // System.out.println(d.sum(1,2,3,4,5,7));

        if(prime(12)) System.out.println("Prime number");
        else System.out.println("Not prime number");

        employee first = new employee();
        first.id=12;
        first.name="My";
        first.printDetails();


    }
    static int sum(int ...arr){
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        return sum;
    }
    static int fact(int a){
        if(a==1 || a==0){
            return 1;
        }
        return a*fact(a-1);
    }
    static Boolean prime(int a){
        for(int i=2;i<a;i++) if(a%i==0) return false;
        return true;
    }
}
class derived extends fifth{
    static int sum(int ...arr){
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        return sum;
    }
}
class employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("id : "+id);
        System.out.println("Name : "+name);
    }
}