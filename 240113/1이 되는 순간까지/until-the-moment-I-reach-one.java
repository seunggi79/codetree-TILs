import java.util.Scanner;

public class Main {

    public static int print(int n, int cnt) {

        if(n <= 1){
            return cnt;
        }
        if(n % 2 == 0){
            n /= 2;
        }else{
            n /= 3;
        }
        cnt++;
        return print(n, cnt);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();


        System.out.println(print(n, cnt));


    }

}