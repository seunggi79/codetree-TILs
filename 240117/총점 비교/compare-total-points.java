import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Print implements Comparable<Print>{
    String name;
    int kor, eng, mat;

    public Print(String name, int kor, int eng, int mat){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    @Override
    public int compareTo(Print print){
        return (this.eng + this.kor + this.mat) - (print.eng + print.kor + print.mat);
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Print[] print = new Print[n];
        for(int i =0; i<n; i++){
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int mat = sc.nextInt();
            print[i] = new Print(name, kor, eng, mat);
        }

        Arrays.sort(print);

        for(int i=0; i<n; i++){
            System.out.print(print[i].name+" ");
            System.out.print(print[i].kor+" ");
            System.out.print(print[i].eng+" ");
            System.out.print(print[i].mat+" ");
            System.out.println();
        }
    }

}