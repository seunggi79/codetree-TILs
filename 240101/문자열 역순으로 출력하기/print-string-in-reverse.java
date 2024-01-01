import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String[] str1 = new String[4];

        for(int i =0; i<4; i++){
            str1[i] = sc.next();
            
        }
        for(int i =3; i<=0; i--){
            System.out.println(str1[i]);

        }

        

    }
}