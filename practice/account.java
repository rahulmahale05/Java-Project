package practice;

public class account{
    String custName;
    int accountNo;
    account(String n,int no){
        custName=n;
        accountNo=no;
    }
    void display(){
        System.out.println("customer name is"+custName);
        System.out.println("customer account no is"+accountNo);
    }
 }
class savingAccount extends account{
    float savingBal;
    float minimumBal;

    savingAccount(String n,int no,float x,float y){
        super(n,no);
        savingBal=x;
        minimumBal=y;
    }
    void display1(){
    display();
    System.out.println("saving bal is"+savingBal);
    System.out.println("minimum bal is"+minimumBal);
    }
}
class accountDetails extends savingAccount{
    float deposit;
    float withdrawal;

    accountDetails(String n,int no,float x,float y,float a, float b)
{
        super(n,no,x,y);
        deposit=a;
        withdrawal=b;
    }
    void display2()
    {
    display1();
    System.out.println("deposit is"+deposit);
    System.out.println("withdrawal is"+withdrawal);
    }
    public static void main(String args[])
    {
        accountDetails d = new accountDetails ("xyz",120000,10.000f,110.00f,110.00f,110.00f);
        d.display2();
    }
}