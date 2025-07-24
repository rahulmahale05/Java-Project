package day11;

import java.util.Scanner;

interface Camera1{
    void takesnap();
    void recordVideo();
    private void greet(){
        System.out.println("Rahul Mahale");
    }
    default void record(){
        greet();
        System.out.println("recording...");
    }
}
interface wifi1{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone1{
    void callNumber(int Number){
        System.out.println("Calling"+Number);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }

}

class MySmartPhone1 extends MyCellPhone1 implements Camera1,wifi1{
    public void takesnap(){
        System.out.println("Taking snap......");
    }
    public void recordVideo(){
        System.out.println("Recording Video......");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networklist = {"Rahul","Rajesh","Mahale"};
        return networklist;
    }
    public void connectToNetwork(String network){
        System.out.println("Connetcing to " + network);
    }


}


public class polymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MySmartPhone1 m = new MySmartPhone1();
        String[] ar = m.getNetworks();
        for (String item: ar){
            System.out.println(item);
        }
        m.record();
        wifi1 w = new MySmartPhone1();         //this is a smartphone but use it as a camera
        w.connectToNetwork("Computer");  
    }
    
}
