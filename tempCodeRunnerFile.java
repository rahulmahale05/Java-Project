import java.util.Scanner;

public class tempCodeRunnerFile {
    int a;
    public static void main(String args[]) {
        // Declare variables to store decimal number, quotient, and an array for binary
        // digits
        // int dec_num, quot, i = 1, j;
        // int bin_num[] = new int[100];

        // // Create a Scanner object to read input from the user
        // Scanner scan = new Scanner(System.in);

        // // Prompt the user to input a decimal number
        // // System.out.print("Input a Decimal Number: ");
        // dec_num = scan.nextInt();

        // // Initialize the quotient with the decimal number
        // quot = dec_num;


        // // Display the binary representation of the decimal number
        // System.out.print("Binary number is: ");
        // for (j = i - 1; j > 0; j--) {
        //     System.out.print(bin_num[j]);
        // }
        //System.out.print("\n");

        // tempCodeRunnerFile c = new tempCodeRunnerFile();
        // c.a = 3 ;
        // square(c);
        // System.out.println(c.a);
        ram d = new ram(15);
        System.out.println((d.rahul().a));
        d.rahul().j();

        
    }
    // public static void square(tempCodeRunnerFile b){
    //     b.a=6;
    // }
}

class ram{
    int a;
    ram(int a){
        this.a=a;
    }
    ram rahul(){
        ram m = new ram(a+5);
        return m;
    }
    void j(){
        System.out.println(a*a);
    }

}
