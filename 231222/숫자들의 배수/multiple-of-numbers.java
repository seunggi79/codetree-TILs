import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        int[] arr = new int[10];
        for(int i =0; i<10;i++){
            arr[i] = n*(i+1);
            if(arr[i] % 5 == 0){
                cnt++;
            }
            if(cnt == 2){
                break;
            }
        }

        for(int i =0; i<10; i++){
            System.out.print(arr[i]+" ");
        }
    }
}