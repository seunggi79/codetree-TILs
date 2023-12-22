import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);

         char[] arr = new char[10];
        int sum = 0;
        int sum2 =0;
        int cnt = 0;
        while(cnt < 10){
            arr[cnt] = sc.next().charAt(0);
            cnt++;
        }
        System.out.println(arr[1]+" "+arr[4]+" "+arr[7]);



    }
}