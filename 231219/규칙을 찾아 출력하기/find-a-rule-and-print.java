import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            for(int j=1; j<= n; j++){

                if(i==1||i == n){
                    System.out.print("* ");
                }
                else if (i>1&&i<n){
                    if (j == n){
                        System.out.print("*");
                    }
                    else if(i<=j){
                        System.out.print("  ");
                    }
                    else if(i>2 && j<n-1){
                        System.out.print("* ");
                    }
                    else if(j>1&&j<n){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }



                }

            }

            System.out.println();
        }

    }
}