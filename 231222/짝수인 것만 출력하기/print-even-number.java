import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        int[] arr = new int[n];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                arr2[i] = arr[i];
            }
        }

        for(int i =0; i<n; i++){
            if( arr2[i] != 0) 
                System.out.print(arr2[i]+" ");
        }




    }
}