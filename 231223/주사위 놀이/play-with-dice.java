import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[7];

        for (int i =0; i<10; i++){
            int m = sc.nextInt();
            arr[m] += 1;

        }

        for(int i =1; i<= 6; i++){
            System.out.print(i+" - "+arr[i]+"\n");
        }


    }
}