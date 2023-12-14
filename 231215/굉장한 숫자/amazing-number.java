import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        if (a % 3 ==0 && a%2 !=0 ){
            System.out.println("true");
        }
        else if (a%2 !=0 &&a % 5 == 0){
            System.out.println("true");

        }
        else{
            System.out.println("false");
        }

        
        

    }
}