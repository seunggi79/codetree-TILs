import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String str = sc.nextLine();
        char s = sc.next().charAt(0);
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == s){
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}