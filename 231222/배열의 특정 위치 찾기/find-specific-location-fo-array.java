import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int sum2 =0;
        int cnt = 0;
        for(int i=0; i<10;i++){
            arr[i] = sc.nextInt();
            if(i%2!=0){
                sum += arr[i];
            }
            if((i+1)%3==0){
                sum2 += arr[i];
                cnt++;
            }

        }
        System.out.printf(sum+" %.1f", (float)sum2/cnt);



    }
}