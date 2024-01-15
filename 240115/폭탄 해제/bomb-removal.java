import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Print {
    
    String str;
    char c;
    int n;
    
    public Print(String str, char c, int n){
        
        this.str = str;
        this.c = c;
        this.n = n;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        int n = sc.nextInt();
        Print print = new Print(str, c, n);
        System.out.println("code : " + str);
        System.out.println("color : " + c);
        System.out.println("second : " + n);

    }

}