import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int answer = 100;
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<n; i++){
            for(int j=i; j<n; j++){
                if(answer > arr[j]- arr[i] && arr[i] != arr[j]){
                    answer = arr[j] - arr[i];
                }
            }
        }
        System.out.println(answer);



    }
}