import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        print(n, m, k);

    }
    public static void print(int a, int b, int c)
    {
        int min = 100;
        if(a < b){
            if(a < c){
                min = a;
            }else{
                min= c;
            }
        }
        else{
            if(b < c){
                min = b;
            }else{
                min= c;
            }
        }

        System.out.println(min);
    }
}