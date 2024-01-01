import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String str = sc.nextLine();
        String str2 = sc.nextLine();

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                continue;
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
        for(int i = 0; i<str2.length(); i++){
            if(str2.charAt(i) == ' '){
                continue;
            }
            else{
                System.out.print(str2.charAt(i));
            }
        }

    }
}