import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i =1; i <= 9; i++){
            for(int j=1; j <2; j++){
                System.out.print(m+" * "+i+" = "+m*i);
            }
            System.out.print(" / ");

            for(int j = n+1; j<m; j++){
                if (j%2==0){
                    for(int k=1; k < 2; k++){
                        System.out.print(j+" * "+i+" = "+j*i);
                    }
                    System.out.print(" / ");
                }
            }



            for(int j=1; j < 2; j++){
                System.out.print(n+" * "+i+" = "+n*i);
            }
            System.out.println();
        }
    }
}