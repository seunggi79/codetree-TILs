import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<10; i++){
            if(arr[i] < 500 && arr[i]>=max){
                max = arr[i];
            }
            if(arr[i]>500 && arr[i]>=max){
                min = arr[i];
            }
        }
        System.out.println(max+" "+min);

    }
}