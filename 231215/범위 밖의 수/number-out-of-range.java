import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         

        if (a < 10 || a >20){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }



    }
}