import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i = str.length()-1; i>=0; i--){
            if(i%2!=0)
                System.out.print(str.charAt(i));
        }

    }
}