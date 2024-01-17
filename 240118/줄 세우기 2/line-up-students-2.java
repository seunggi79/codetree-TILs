import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Print implements Comparable<Print>{
    int h;
    int w;
    int num;

    public Print( int h, int w,  int num){
        this.h = h;
        this.w = w;
        this.num = num;
    }

    @Override
    public int compareTo(Print print) {
        if (this.h == print.h){
            return print.w - this.w ;
        }
        return this.h - print.h;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Print[] print = new Print[n];
        for(int i =0; i<n; i++){

            int h = sc.nextInt();
            int w = sc.nextInt();
            print[i] = new Print(h, w, i+1);
        }

        Arrays.sort(print, 0, n);

        for(int i=0; i<n; i++){
            System.out.print(print[i].h+" ");
            System.out.print(print[i].w+" ");
            System.out.println(print[i].num);
        }

    }

}