import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[200];
        int cnt = 0;
        while(true){
            arr[cnt] = sc.nextInt();
            if(arr[cnt] == 0){
                break;
            }
            cnt++;
        }
        System.out.println(arr[cnt-3]+arr[cnt-2]+arr[cnt-1]);
    }
}