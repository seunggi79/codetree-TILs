import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        boolean satisfied= true;

        


        for (int i = 1; i<=5; i++){
            int n = sc.nextInt();
            if(n % 3 == 0){
                continue;
            }
            else{
                satisfied = false;
            }
        }
        if(satisfied){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

    }
}