import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i = 0; i < n; i++){

            for(int j = 0; j<n-i-1; j++){
                System.out.print("^");
            }

            for(int k = 0; k < (2*i)+1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i = 0; i < n-1; i++){

            for(int j = 0; j<i+1; j++){
                System.out.print("^");
            }

            for(int k = 0; k < n-(2*i); k++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}