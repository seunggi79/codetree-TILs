import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        int max = 0;
        int min = 20;
        if(max <= str.length()){
            max = str.length();
        }
        if(max <= str2.length()){
            max = str2.length();
        }
        if(max <= str3.length()){
            max = str3.length();
        }

        if(min >= str.length()){
            min = str.length();
        }
        if(min >= str2.length()){
            min = str2.length();
        }
        if(min >= str3.length()){
            min = str3.length();
        }

        System.out.println(max-min);

    }
}