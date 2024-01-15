import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Print {

    String str;
    int n;

    public Print(String str, int n){

        this.str = str;
        
        this.n = n;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        Print print1 = new Print("codetree", 50);
        Print print2 = new Print(str, n);
        System.out.println("product : " + print1.n+" is "+print1.str);
        System.out.println("product : " + print2.n+" is "+print2.str);

    }

}