import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i = 1; i <= 2*n; i++){



            if(i%2 == 0){
                for(int j = 0; j<1+(i/2)-1; j++){
                    System.out.print("^ ");
                }
            }else{
                for(int j = 0; j<n - (i - 1) / 2; j++){
                    System.out.print("^ ");
                }
            }


            System.out.println();
        }
//        for(int i = 0; i < n-1; i++){
//
//            for(int j = 0; j<i+1; j++){
//                System.out.print(" ");
//            }
//
//            for(int k = 0; k < n-i-1; k++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }


    }
}