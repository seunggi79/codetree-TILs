import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i =2; i <= 8; i+=2){
            for(int j = m; j >=n; j--){
                System.out.print(j+" * "+i+" = "+j*i);
                if (j!=n)
                    System.out.print(" / ");
            }
            System.out.println();
        }
    }
}