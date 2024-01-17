import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Print{

    String name;
    int height;
    int weight;

    public Print(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;

    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Print[] print = new Print[n];
        for(int i =0; i<n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            print[i] = new Print(name, height, weight);

        }

        Arrays.sort(print, new Comparator<Print>() {
            @Override
            public int compare(Print o1, Print o2) {
                if(o1.height == o2.height){
                    return o2.weight - o1.weight;
                }
                return o1.height - o2.height;
            }
        });


        for(int i=0; i<n; i++){
            System.out.print(print[i].name+" ");
            System.out.print(print[i].height+" ");
            System.out.println(print[i].weight);
        }
        System.out.println();





    }

}