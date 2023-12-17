import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        int m = sc.nextInt();

        if(n == 'A'){
            for (int i =1; i<= m; i++){
                System.out.print(i+ " ");
            }
        }else{
            for (int i=m; i >= 1; i--){
                System.out.print(i+ " ");
            }
        }


    }
}