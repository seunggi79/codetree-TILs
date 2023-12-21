import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;
        int cnt2 =0;
        int sum =0;
        while(true){
            arr[cnt] = sc.nextInt();
            if(arr[cnt] == 0){
                break;
            }
            if(cnt == 9){
                cnt++;
                break;
            }
            cnt++;
        }
        for(int i = cnt-1; i >= 0; i--){
            if(arr[i] % 2 == 0){
                sum += arr[i];
                cnt2+=1;
            }
            
        }
        System.out.print(cnt2+" "+sum);



    }
}