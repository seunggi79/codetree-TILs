import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (float i = 1; i <=n; i++){

            if(Math.round(i / 10) % 3 == 0 && i >=10){
                System.out.print(0 + " ");

            } else if (Math.round(i % 10) % 3 == 0) {
                System.out.print(0 + " ");
            } else{
                System.out.printf("%.0f ", i);

            }
        }

    }
}