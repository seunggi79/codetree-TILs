import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        boolean satisfied= false;

        int n = sc.nextInt();
       

        for (int i = 1; i<n; i++){
            if(n % i == 0){
                satisfied = true;
            }
        }
        if(satisfied){
            System.out.println('P');
        }
        else {
            System.out.println('C');
        }

    }
}