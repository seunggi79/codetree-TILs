import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print(n);

    }
    public static void print(int a){
        int cnt = 1;
        for(int i = 0; i<a; i++){
            for(int j =0; j<a; j++){
                System.out.print(cnt+" ");
                cnt++;
                if(cnt == 10){
                    cnt = 1;
                }
            }
            System.out.println();
        }
    }
}