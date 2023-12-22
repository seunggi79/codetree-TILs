import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int cnt =0;
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        if(sum/n >= 60){
            System.out.println("pass");
            cnt++;
        }
        else{
            System.out.println("fail");
        }
        System.out.println(cnt);



    }
}