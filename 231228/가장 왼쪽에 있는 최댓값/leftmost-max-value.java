import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        int max = arr[0];
        int maxIdex = 0;
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                maxIdex=i; // 2
                max = arr[i]; // 5
            }
        }
        System.out.print(maxIdex+1+" ");
        // 최대값 찾기
        // 최대값 찾은 후 인덱스를 저장

        // 인덱스 이전의 숫자들중 최대값 찾기
        // 최대값 찾은 후 인덱스를 저장
        // 인덱스가 0이면 그만 아니면 반복
        while(true){

            max = arr[0];
            int k = maxIdex;
            maxIdex = 0;
            for(int i = 0; i<k; i++){
                if(arr[i]>max){
                    max = arr[i]; // 3
                    maxIdex = i; // 0
                }
            }

            System.out.print(maxIdex+1+" ");
            if(maxIdex+1 == 1){
                break;
            }

        }

    }
}