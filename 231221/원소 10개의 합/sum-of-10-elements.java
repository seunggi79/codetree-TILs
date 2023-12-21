import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        for(int i =0; i<10; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];

        }
        System.out.println(sum);





    }
}