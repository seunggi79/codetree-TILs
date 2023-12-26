import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        int max = -999;
        int min = 999;
        while(true){
            arr[cnt] = sc.nextInt();
            if(arr[cnt] == 999 || arr[cnt] == -999){
                break;
            }
            if(arr[cnt] <= min){
                min = arr[cnt];
            }
            if(arr[cnt] >= max){
                max = arr[cnt];
            }
            
            cnt++;
        }
        System.out.print(max+" "+min);
    }
}