import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Print{
    char c;
    int n;

    public Print(){
        this.c = ' ';
        this.n = 0;
    }
    public Print(char c, int n){
        this.c = c;
        this.n = n;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 101;
        Print[] print = new Print[5];
        for(int i =0; i<5; i++){
            char c = sc.next().charAt(0);
            int n = sc.nextInt();
            print[i] = new Print(c, n);
            if(min >= print[i].n){
                min = print[i].n;
            }
        }
        
        for(int i=0; i<5;i++){
            if(min == print[i].n){
                System.out.print(print[i].c +" "+print[i].n);
                System.exit(0);
            }
        }
        
    }

}