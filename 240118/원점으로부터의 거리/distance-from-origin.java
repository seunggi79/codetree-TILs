import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Print{


    int x;
    int y;
    int num;

    public Print( int x, int y, int num){

        this.x = x;
        this.y = y;
        this.num = num;

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

        Arrays.sort(print, new Comparator<Print>() {
            @Override
            public int compare(Print o1, Print o2) {
                return Math.abs(o1.x + o1.y) - Math.abs(o2.x + o2.y);
            }
        });


        for(int i=0; i<n; i++){
            System.out.println(print[i].num);
        }






    }

}