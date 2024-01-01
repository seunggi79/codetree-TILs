import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String[] str1 = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        
        char s = sc.next().charAt(0);
        
        for(int i =0; i<5; i++){
            if ( s == str1[i].charAt(3)||s == str1[i].charAt(4)){
                System.out.println(str1[i]);
                cnt += 1;
            }
        }

        System.out.println(cnt);

    }
}