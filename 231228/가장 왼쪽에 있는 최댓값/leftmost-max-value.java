import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // 최대값 찾기
        // 최대값 찾은 후 인덱스를 저장

        // 인덱스 이전의 숫자들중 최대값 찾기
        // 최대값 찾은 후 인덱스를 저장
        // 인덱스가 0이면 그만 아니면 반복
        while(true){

            int max = arr[0]; // 3
            int maxIdex = 0;
            for(int i = 0; i<n; i++){
                if(arr[i]>max){
                    max = arr[i]; // 3
                    maxIdex = i; // 0
                }
            }

            System.out.print(maxIdex+1+" ");
            if(maxIdex+1 == 1){
                break;
            }
            n = maxIdex;
        }

    }
}