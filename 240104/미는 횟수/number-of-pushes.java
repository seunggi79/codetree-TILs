import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();
        int cnt = 0;
        int cnt2 = 0;
        // 문자열의 길이 만큼 반복
        for(int i =0; i<str.length(); i++){
            str = str.substring(str.length()-1, str.length())+str.substring(0,str.length()-1);
            cnt++;
            if(str.equals(str2)){
                break;
            }
            else{
                cnt2++;
            }
        }
        if(cnt2 == str.length()){
            System.out.println(-1);
        }
        else
            System.out.println(cnt);
    }
}