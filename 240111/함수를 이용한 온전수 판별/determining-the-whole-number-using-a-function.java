import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(print(n, m));
    }
    public static int print(int a, int b) {
        int cnt = 0;
        for(int i=a; i<=b; i++){

            if(i % 2 != 0){
                if(i%10 != 5){
                    if(i % 3 != 0 || i % 9 ==0){
                        cnt++;
                    }
                }
            }

        }
        return cnt;
    }

}