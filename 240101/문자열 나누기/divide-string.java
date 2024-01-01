import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        String str2 = "";
        for(int i=0; i<n; i++){
            String str = sc.next();
            str2 += str;


        }
        for(int i = 1; i<str2.length()+1; i++){
            System.out.print(str2.charAt(i-1));
            if(i % 5 == 0) {
                System.out.println();
            }


        }

    }
}