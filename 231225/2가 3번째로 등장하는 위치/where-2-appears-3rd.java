import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 2){
                cnt+=1;
            }
            if(cnt == 3){
                System.out.println(i+1);
                break;
            }
        }

    }
}