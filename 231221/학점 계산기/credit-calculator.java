import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0;
        for (int i =0; i<n; i++){
            float[] arr = new float[n];
            arr[i] = sc.nextFloat();
            sum+=arr[i];

        }
        System.out.printf("%.1f\n", Math.ceil((sum/n*10)/10.0));
        if(sum/n >= 4.0){
            System.out.println("Perfect");

        }
        else if ( sum/n>=3.0){
            System.out.println("Good");
        }
        else
            System.out.println("Poor");



    }
}