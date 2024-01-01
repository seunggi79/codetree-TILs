import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str2 ="";
        for(int i=0; i<n; i++){
            String str = sc.next();
            str2 += str;
            
        }
        
        System.out.println(str2);

    }
}