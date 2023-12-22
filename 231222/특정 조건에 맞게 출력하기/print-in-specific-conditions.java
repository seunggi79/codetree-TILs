import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        int[] arr = new int[100];
        while(true){
            arr[cnt] = sc.nextInt();
            if(arr[cnt] == 0 ){
                break;
            }
            cnt++;
        }

        for(int i =0; i<cnt; i++){
            if(arr[i] %2 != 0)
                System.out.print(arr[i]+3 +" ");
            else
                System.out.print(arr[i]/2+" ");
        }
    }
}