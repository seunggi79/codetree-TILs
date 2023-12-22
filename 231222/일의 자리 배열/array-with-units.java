import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[10];
        arr[0]=n;
        arr[1]=m;
        for(int i =2; i<10;i++){
            arr[i] = arr[i-2]+arr[i-1];
            if(arr[i] >=10){
                arr[i] = arr[i] % 10;
            }
        }

        for(int i =0;i<10; i++){
            System.out.print(arr[i]+" ");
        }
    }
}