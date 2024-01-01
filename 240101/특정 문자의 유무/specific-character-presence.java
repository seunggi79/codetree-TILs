import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        boolean k = true;
        String str1 = sc.next();
        for(int i =0; i<str1.length()-1; i++){
            if(str1.charAt(i) == 'e' && str1.charAt(i+1) == 'e'){
                System.out.print("Yes ");
                k = false;
                break;
            }

        }
        if(k){
            System.out.print("No ");
        }
        k = true;
        for(int i =0; i<str1.length()-1; i++){
            if(str1.charAt(i) == 'a'&&str1.charAt(i+1) == 'b'){
                System.out.print("Yes");
                k = false;
                break;
            }

        }
        if(k){
            System.out.print("No ");
        }

    }
}