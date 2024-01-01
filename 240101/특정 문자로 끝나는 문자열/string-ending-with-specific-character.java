import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int cnt2 = 0;

        String[] str = new String[10];
        for(int i =0; i<10; i++){
            str[i] = sc.next();

        }
        char s = sc.next().charAt(0);

        for(int i = 0; i<10; i++){
            if(str[i].charAt(str[i].length()-1) == s){
                System.out.println(str[i]);
                cnt += 1;
            }
            
        }

        if(cnt == 0){
            System.out.println("None");
        }

    }
}