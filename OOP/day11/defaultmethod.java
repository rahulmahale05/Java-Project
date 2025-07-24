package day11;

import java.util.Scanner;

interface Camera{
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
interface wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int Number){
        System.out.println("Calling"+Number);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }

}

class MySmartPhone extends MyCellPhone implements Camera,wifi{
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

public class defaultmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MySmartPhone m = new MySmartPhone();
        String[] ar = m.getNetworks();
        for (String item: ar){
            System.out.println(item);
        }
        m.record();
    }
    
}
