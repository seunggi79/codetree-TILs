import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String strA = str1 + str2;
        String strB = str2 + str1;
        boolean k = true;
        for(int i = 0; i<strA.length(); i++){
            if(strA.charAt(i) == strB.charAt(i)){
                continue;
            }
            else{
                k = false;
                break;
            }
        }

        if(k){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}