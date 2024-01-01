import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int cnt2 = 0;
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i =0; i<n; i++){
            str[i] = sc.next();
            cnt += str[i].length();
            for(int j =0; j<str[i].length(); j++){
                if (str[i].charAt(0) == 'a')
                    cnt2 +=1;
                    break;
            }
        }
        System.out.println(cnt+ " "+cnt2 );

    }
}