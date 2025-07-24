package practice;

import day14.exception;

public class pr4 {
    public static void main(String[] args) {
        try{
            area(-12);
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            int a;
            a=5/1;
            throw new myException("I want to give error in program because my life my decision");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    static void area(int r) throws negativeradius{
        if(r<0){
            throw new negativeradius();
        }
        else{
            System.out.println(3.14*r*r);
        }
    }
}

class negativeradius extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Radius can not be negative";
    }
}
class myException extends Exception{
    String error;
    myException(String a){
        this.error=a;
    }
    @Override
    public String toString() {
        return this.error;
    }
}

