import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);

         int[] arr = new int[10];
        int sum = 0;
        int sum2 =0;
        int cnt = 0;
        while(cnt < 10){
            arr[cnt] = sc.nextInt();
            if((cnt) % 2 ==0){
                sum += arr[cnt];
            }
            else{
                sum2 += arr[cnt];
            }
            cnt++;
        }
        if(sum > sum2){
            System.out.println(sum - sum2);
        }
        else{
            System.out.println(sum2 - sum);
        }
    }
}