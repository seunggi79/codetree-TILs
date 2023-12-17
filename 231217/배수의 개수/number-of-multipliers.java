import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        int cnt3 = 0;
        int cnt5 = 0;
        for (int i = 1; i <=10; i++){
            int m = sc.nextInt();

            if(m % 3 == 0){
                cnt3 += 1;
            }
            if(m % 5 ==0 ){
                cnt5 += 1;
            }

        }
        System.out.print(cnt3+" ");
        System.out.print(cnt5);

    }

}