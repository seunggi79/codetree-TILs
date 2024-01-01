import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        boolean k = true;
        String str1 = sc.next();
        int cnt = 0;
        int cnt2 = 0;
        for(int i =0; i<str1.length()-1; i++){
            if(str1.charAt(i) == 'e' && str1.charAt(i+1) == 'e'){
                cnt+=1;

            }

        }


        for(int i =0; i<str1.length()-1; i++){
            if(str1.charAt(i) == 'e'&&str1.charAt(i+1) == 'b'){
                cnt2 += 1;
                
            }

        }
        System.out.println(cnt  +" "+cnt2);
        


    }
}