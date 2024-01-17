import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Print implements Comparable<Print>{
    int x;
    int y;
    int num;

    public Print( int x, int y, int num){
        this.x = x;
        this.y = y;
        this.num = num;
    }

    @Override
    public int compareTo(Print o) {
        return Math.abs(this.x + this.y)- Math.abs(o.x + o.y);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Print[] print = new Print[n];
        for(int i =0; i<n; i++){

            int x = sc.nextInt();
            int y = sc.nextInt();
            print[i] = new Print(x, y, i+1);
        }

        Arrays.sort(print, 0, n);

        for(int i=0; i<n; i++){
            System.out.println(print[i].num);
        }

    }

}