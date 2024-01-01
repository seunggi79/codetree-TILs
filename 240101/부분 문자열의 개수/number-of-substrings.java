import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int cnt = 0;
        for(int i=0; i< str1.length()-1; i++){
            for(int j =0; j<1; j++){
                if(str1.charAt(i) == str2.charAt(j)&&str1.charAt(i+1) == str2.charAt(j+1)){
                    cnt+=1;
                }
            }
        }
        System.out.println(cnt);
    }
}