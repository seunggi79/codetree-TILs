import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        int cnt = 0;
        int cnt2 = 0;
        for(int i =0; i<n; i++){
            str[i] = sc.next();
        }
        char c = sc.next().charAt(0);
        
        for(int i=0; i<n;i++){
            if (str[i].charAt(0) == c){
                cnt+=1;
                cnt2 += str[i].length();
            }
        }

        System.out.printf(cnt+" %.2f", (double)cnt2/cnt);


    }
}