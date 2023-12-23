import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[11];

        while(true){
            int n = sc.nextInt();

            if( n == 0 ){
                break;
            }
            if( n-10 < 0 ){
                continue;
            }
            arr[n/10] += 1;
        }

        for(int i =10; i>= 1; i--){
            System.out.print((i*10)+" - "+arr[i]+"\n");
        }


    }
}