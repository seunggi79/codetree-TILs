import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String[] str1 = new String[10];
        for(int i=0; i<10; i++){
            str1[i] = sc.next();
            cnt += str1[i].length();
        }
        System.out.println(cnt);



    }
}