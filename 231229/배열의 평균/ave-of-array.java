import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int[][] n = new int[2][4];

        for(int i =0; i<2; i++){
            int sum = 0;
            for(int j =0; j<4; j++){
                n[i][j] = sc.nextInt();
                sum+=n[i][j];
            }
            System.out.print((double) sum/4 + " ");
        }
        System.out.println();
        for(int j =0; j<4; j++){
            int sum = 0;
            for(int i =0; i<2; i++){
                sum+=n[i][j];
            }
            System.out.print((double) sum/2 + " ");
        }
        System.out.println();
        int sum = 0;
        for(int j =0; j<4; j++){
            for(int i =0; i<2; i++){
                sum+=n[i][j];
            }
        }
        System.out.print((double) sum/8 + " ");

    }
}